package cat.teknos.m06.dbutils.Exceptions;

public class DbUtilsException extends RuntimeException{

    public DbUtilsException() {
    }

    public DbUtilsException(String message) {
        super(message);
    }

    public DbUtilsException(String message, Throwable cause) {
        super(message, cause);
    }

    public DbUtilsException(Throwable cause) {
        super(cause);
    }

    public DbUtilsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
