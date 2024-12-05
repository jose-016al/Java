import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            // Variables
        String url = "jdbc:mysql://localhost:3306/universidad";
        String user = "user";
        String password = "user";
        String name = "";
        int age = 0, option = 0;
        double grade = 0;

        try {
                // Conexion con la base de datos
            Connection conexion = DriverManager.getConnection(url, user, password);
            Statement statement = conexion.createStatement();

            do {
                System.out.println("-----Menu-----");
                System.out.println("1. Inserción de notas");
                System.out.println("2. Consultar notas de alumnos");
                System.out.println("3. Salir");
                System.out.print("Introduce una de las opciones entre 1 y 3: ");
                    option = input.nextInt();
                    input.nextLine();
                System.out.println("-------------- \n");

                switch (option) {
                    case 1:
                        System.out.println("-----Inserción-----");
                        System.out.print("Introduce el nombre del alumno: ");
                            name = input.nextLine();
                        System.out.print("Introduce la edad de " + name + ": ");
                            age = input.nextInt();
                            input.nextLine();
                        System.out.print("Introduce la calificación de " + name + "; ");
                            grade = input.nextDouble();
                            input.nextLine();

                        String insert = "INSERT INTO estudiantes (name, age, grade) VALUES ('" + name + "', " + age + ", " + grade + ");";
                        statement.executeUpdate(insert);
                        System.out.println("-----Alumno insertado-----\n");
                        break;
                    case 2:
                        String consult = "SELECT * FROM estudiantes";
                        ResultSet resultado = statement.executeQuery(consult);

                            // Obtener todos los registros de la tabla
                        while (resultado.next()) {
                            long id = resultado.getInt("id");
                            name = resultado.getString("name");
                            age = resultado.getInt("age");
                            grade = resultado.getDouble("grade");
                            System.out.println("ID: " + id + ", Nombre: " + name + ", Edad: " + age + ", Calificación: " + grade);
                        }
                        System.out.print("\n");
                        resultado.close();
                        break;
                    default:
                        break;
                }
            } while (option != 3);

                // Cierra la conexión y recursos
            statement.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}