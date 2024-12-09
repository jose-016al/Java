public class FechaException extends Exception {
    // Constructor con mensaje
    public FechaException(String message) {
        super(message);
    }

    // Constructor con mensaje y causa
    public FechaException(String message, Throwable cause) {
        super(message, cause);
    }
}
