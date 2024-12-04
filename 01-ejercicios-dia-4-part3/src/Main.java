import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cannon impresora1 = new Cannon("Canon Pixma G6020", "WiFi", LocalDate.of(2022, 5, 15), 100, 80);
        Cannon impresora2 = new Cannon("Canon ImageClass MF644Cdw", "Ethernet", LocalDate.of(2021, 8, 10), 200, 60);
        Cannon impresora3 = new Cannon("Canon TS5120", "USB", LocalDate.of(2023, 3, 22), 50, 90);

        // Impresoras Epson
        Epson impresora4 = new Epson("Epson EcoTank ET-4760", "WiFi", LocalDate.of(2020, 9, 30), 150, 70);
        Epson impresora5 = new Epson("Epson WorkForce WF-7210", "Bluetooth", LocalDate.of(2023, 1, 12), 80, 85);

        Impresora[] impresoras = {impresora1, impresora2, impresora3, impresora4, impresora5};

        for (Impresora impresora : impresoras) {
            impresora.imprimir();
        }
    }
}
