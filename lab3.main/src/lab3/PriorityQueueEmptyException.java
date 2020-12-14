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
 * @version 2019-11-15
 */
public class PriorityQueueEmptyException extends RuntimeException {
	static final long serialVersionUID = 1;
			
	public PriorityQueueEmptyException() {
		super();
	}
	
	public PriorityQueueEmptyException(String message) {
        super(message);
    }
	
	public PriorityQueueEmptyException(String message, Throwable cause) {
        super(message, cause);
    }
	
	public PriorityQueueEmptyException(Throwable cause) {
        super(cause);
    }
	
	protected PriorityQueueEmptyException(String message, Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
