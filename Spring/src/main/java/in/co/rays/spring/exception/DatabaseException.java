/*
 * @author Mayank mishra
 */
package in.co.rays.spring.exception;

/**
 * The Class DatabaseException.
 */
public class DatabaseException extends Exception {

    /**
     * param msg
     *            : Error message
     */
    public DatabaseException(String msg) {
        super(msg);
    }
}
