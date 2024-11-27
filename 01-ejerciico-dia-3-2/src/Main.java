public class Main {
    public static void main(String[] args) {

            // Apartado A
        Impresora impresora1 = new Impresora("model7564", "laser", "2023-07-04", 56);
        Impresora impresora2 = new Impresora("model8321", "tinta", "2021-09-12", 230);
        Impresora impresora3 = new Impresora("model1290", "matriz", "2020-02-28", 1024);

        Impresora[] impresoras = {impresora1, impresora2, impresora3};

            // Apartado B
        for (int i = 0; i < impresoras.length; i++) {
            System.out.println("-----Impresora" +(i+1)+"-----");
            System.out.println("Modelo de impresora: " + impresoras[i].getModelo() + " y el tipo de conexion es " + impresoras[i].getTipo());
        }
    }
}
