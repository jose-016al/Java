package org.example;

import org.example.logica.Empleado;
import org.example.persistencia.ControladoraPersistencia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            ControladoraPersistencia controlPersis = new ControladoraPersistencia();
            List<Empleado> list = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            Empleado empleado = new Empleado();
            int option;

            refreshList(controlPersis, list);

            do {
                System.out.println("-----Menú-----");
                System.out.println("1. Agregar un nuevo empleado");
                System.out.println("2. Listar empleados");
                System.out.println("3. Actualizar información de un empleado");
                System.out.println("4. Eliminar un empleado");
                System.out.println("5. Buscar empleados por cargo");
                System.out.println("6. Salir");
                option = getIntInput(input, "Introduce una de las opciones entre 1 y 6: ");
                System.out.println("-------------- \n");

                switch (option) {
                    case 1:
                        add(input, empleado, list, controlPersis);
                        break;
                    case 2:
                        listAll(list, controlPersis);
                        break;
                    case 3:
                        update(input, empleado, list, controlPersis);
                        break;
                    case 4:
                        delete(input, empleado, list, controlPersis);
                        break;
                    case 5:
                        listByPosition(input, controlPersis);
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("No has introducido una opcion valida");
                        break;
                }
            } while (option != 6);
        } catch (Exception e) {
            System.out.println("Error: Algo salió mal. Asegúrate de que el servidor MySQL esté en ejecución y que exista una base de datos llamada 'empleados'.");
        }
    }

        // Metodo para garantizar que la lista de empleados en el array se mantenga siempre actualizada
    private static void refreshList(ControladoraPersistencia controlPersis, List<Empleado> list) {
        list.clear();
        list.addAll(controlPersis.getEmployee());
    }

        // Metodo para capturar y validar la entrada de un número entero desde la consola
    private static int getIntInput(Scanner input, String s) {
        int value = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(s);
            String inputValid = input.nextLine();
            if (inputValid.isBlank()) {
                System.out.println("Este campo no puede estar vacío. Inténtalo de nuevo.");
            } else {
                try {
                    value = Integer.parseInt(inputValid);
                    valid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error, el valor debe ser numérico.");
                }
            }
        }
        return value;
    }

        // Metodo para capturar y validar la entrada de un String desde la consola
    private static String getStringInput(Scanner input, String s) {
        String value = "";
        while (value.isBlank()) {
            System.out.print(s);
                value = input.nextLine();
            if (value.isBlank()) {
                System.out.println("Este campo no puede estar vacío. Inténtalo de nuevo.");
            }
        }
        return value;
    }

        // Metodo para capturar y validar la entrada de un número decimal desde la consola
    private static double getDoubleInput(Scanner input, String s) {
        double value = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(s);
                String inputValid = input.nextLine();
            if (inputValid.isBlank()) {
                System.out.println("Este campo no puede estar vacío. Inténtalo de nuevo.");
            } else {
                try {
                    value = Double.parseDouble(inputValid);
                    valid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error, el valor debe ser numérico.");
                }
            }
        }
        return value;
    }

        // Metodo para capturar y validar la entrada de un Date desde la consola
    private static Date getDateInput(Scanner input, String s) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        Date value = null;
        while (value == null) {
            System.out.print("Introduce la fecha de inicio (dd/MM/yyyy): ");
                String startDateStr = input.nextLine();
            if (startDateStr.isBlank()) {
                System.out.println("Este campo no puede estar vacío. Inténtalo de nuevo.");
            } else {
                try {
                    value = dateFormat.parse(startDateStr);
                    if (value.after(new Date())) {
                        System.out.println("La fecha no puede ser superior a la actual. Inténtalo de nuevo.");
                        value = null;
                    }
                } catch (ParseException e) {
                    System.out.println("Formato de fecha inválido. Inténtalo de nuevo.");
                }
            }
        }
        return value;
    }

        // Metodo para agregar un empleado a la base de datos
    private static void add(Scanner input, Empleado empleado, List<Empleado> list, ControladoraPersistencia controlPersis) {
        System.out.println("-----Agregar empleado-----");
        String name = getStringInput(input, "Introduce el nombre del empleado: ");
        String surname = getStringInput(input, "Introduce el apellido de " + name + ": ");
        String position = getStringInput(input, "Introduce el cargo de " + name + ": ");
        double salary = getDoubleInput(input, "Introduce el salario: ");
        Date startDate = getDateInput(input, "Introduce la fecha de inicio (dd/MM/yyyy): ");

        empleado = new Empleado(name, surname, position, salary, startDate);
        controlPersis.createEmployee(empleado);

        refreshList(controlPersis, list);

        System.out.println("\n-----Empleado agregado-----");
        System.out.println(empleado + "\n");
    }

        // Metodo para listar todos los empleados de la base de datos
    private static void listAll(List<Empleado> list, ControladoraPersistencia controlPersis) {
        System.out.println("-----Lista de empleados-----");
        for (Empleado emp:list) {
            System.out.println(emp);
        }
        if (list.isEmpty()) {
            System.out.println("No hay empleados");
        }
        System.out.print("\n");
    }

        // Metodo para actualizar la informacion de un empleado de la base de datos
    private static void update(Scanner input, Empleado empleado, List<Empleado> list, ControladoraPersistencia controlPersis) {
        boolean valid = false;
        System.out.println("-----Actualizar información del empleado-----");

        while(!valid) {
            int id = getIntInput(input, "Introduce el ID del empleado (puedes consultarlo en la opción 2 del menú): ");
            for (Empleado emp:list) {
                if (emp.getId() == id) {
                    empleado = emp;
                    valid = true;
                    break;
                }
            }
            if (!valid) {
                System.out.println("Error: El ID del empleado no existe. Inténtalo de nuevo.");
            }
        }

        empleado.setName(getStringInput(input, "Introduce el nombre del empleado: "));
        empleado.setSurname(getStringInput(input, "Introduce el apellido de " + empleado.getName() + ": "));
        empleado.setPosition(getStringInput(input, "Introduce el cargo de " + empleado.getName() + ": "));
        empleado.setSalary(getDoubleInput(input, "Introduce el salario: "));
        empleado.setStartDate(getDateInput(input, "Introduce la fecha de inicio (dd/MM/yyyy): "));

        controlPersis.modifyEmployee(empleado);

        System.out.println("\n-----Empleado modificado-----");
        System.out.println(empleado + "\n");
    }

        // Metodo para eliminar un empleado de la base de datos
    private static void delete(Scanner input, Empleado empleado, List<Empleado> list, ControladoraPersistencia controlPersis) {
        boolean valid = false;
        System.out.println("-----Eliminar empleado-----");

        while(!valid) {
            int id = getIntInput(input, "Introduce el ID del empleado (puedes consultarlo en la opción 2 del menú): ");
            for (Empleado emp:list) {
                if (emp.getId() == id) {
                    empleado = emp;

                    controlPersis.deleteEmployee((long) id);
                    valid = true;
                    break;
                }
            }
            if (!valid) {
                System.out.println("Error: El ID del empleado no existe. Inténtalo de nuevo.");
            }
        }

        refreshList(controlPersis, list);
        System.out.println("\n-----Empleado eliminado-----");
        System.out.println(empleado + "\n");
    }

        // Metodo para listar los empleados segun se cargo
    private static void listByPosition(Scanner input, ControladoraPersistencia controlPersis) {
        System.out.println("-----Lista de empleados segun un cargo-----");
        String position = getStringInput(input, "Introduce un cargo: ");
        List<Empleado> listSearch = controlPersis.getEmployeeByPosition(position);
        System.out.println("\n-----Lista de " + position + "-----");
        for (Empleado emp:listSearch) {
            System.out.println(emp);
        }
        if (listSearch.isEmpty()) {
            System.out.println("No se han encontrado empleados con ese cargo");
        }
        System.out.print("\n");
    }
}