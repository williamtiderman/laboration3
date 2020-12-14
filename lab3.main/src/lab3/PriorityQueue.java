package lab3;

/**
 * @author John Engblom Sandin
 * @author William Tiderman
 * @version 2020-12-13
 */

public interface PriorityQueue <T extends Comparable<? super T>> {

	public void clear();
	
	public boolean isEmpty();
	
	public boolean isFull();
	
	public int size();
	
	public void enqueue(T t);
	
	public T dequeue();
	
	public T getFront();
}
