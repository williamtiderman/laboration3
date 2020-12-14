/*
 * This is free to use in courses at University of Gävle.
 */
package lab3;
/**
 * Exception thrown when no data in Queue<V>
 * 
 * @author Anders Jackson
 * @author John Engblom Sandin
 * @author William Tiderman
 * @version 2020-12-13
 */
public class PriorityQueueFullException extends RuntimeException {
	static final long serialVersionUID = 1;
			
	public PriorityQueueFullException() {
		super();
	}
	
	public PriorityQueueFullException(String message) {
        super(message);
    }
	
	public PriorityQueueFullException(String message, Throwable cause) {
        super(message, cause);
    }
	
	public PriorityQueueFullException(Throwable cause) {
        super(cause);
    }
	
	protected PriorityQueueFullException(String message, Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
