public class EventLogger {
    // La instancia única de la clase EventLogger
    private static EventLogger instance;

    // Constructor privado para evitar instanciación directa
    private EventLogger() {
        // Inicialización del registro de eventos
        System.out.println("Inicializando el registro de eventos.");
    }

    // Método de acceso para obtener la instancia única
    public static EventLogger getInstance() {
        // Si la instancia no existe, la crea
        if (instance == null) {
            instance = new EventLogger();
        }
        // Devuelve la instancia existente
        return instance;
    }

    // Método para registrar un evento en el sistema
    public void logEvent(String eventName) {
        System.out.println("Registrando evento: " + eventName);
        // Lógica de registro de eventos
    }
}