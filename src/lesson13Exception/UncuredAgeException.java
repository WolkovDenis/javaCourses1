package lesson13Exception;

public class UncuredAgeException extends Exception{

    public UncuredAgeException() {
    }

    public UncuredAgeException(String message) {
        super(message);
    }

    public UncuredAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UncuredAgeException(Throwable cause) {
        super(cause);
    }

    public UncuredAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
