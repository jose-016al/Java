public class Main {
    public static void main(String[] args) {
        EventLogger loggerSensor1 = EventLogger.getInstance();
        EventLogger loggerSensor2 = EventLogger.getInstance();

        // Ambas referencias deberían apuntar a la misma instancia
        System.out.println(loggerSensor1 == loggerSensor2); // Debería imprimir true

        // Registrar eventos desde diferentes sensores
        loggerSensor1.logEvent("Sensor 1 - Detección de movimiento");
        loggerSensor2.logEvent("Sensor 2 - Temperatura elevada");

    }
}