package exception;

public class BookOperationException extends RuntimeException {
    public BookOperationException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public BookOperationException(String message) {
        super(message);
    }
}
