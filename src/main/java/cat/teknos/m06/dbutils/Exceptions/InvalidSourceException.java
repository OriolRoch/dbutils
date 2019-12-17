package cat.teknos.m06.dbutils.Exceptions;

public class InvalidSourceException extends Exception{

    public InvalidSourceException() {
    }

    public InvalidSourceException(String message) {
        super(message);
    }

    public InvalidSourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSourceException(Throwable cause) {
        super(cause);
    }

    public InvalidSourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
