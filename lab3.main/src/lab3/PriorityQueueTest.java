package lab3;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author John Engblom Sandin
 * @author William Tiderman
 * @version 2020-12-13
 */


class PriorityQueueTest {

	PriorityQueue<Integer> testQueue;
	static final int[] INT_FIXTURE = { 1, 2, 3, 4, 5 };
	
	@BeforeEach
	void setUp() throws Exception {
		testQueue = new PriorityQueueStub<Integer>();
		for (int data : INT_FIXTURE) {
			testQueue.enqueue(data);
		}
	}

	@AfterEach
	void tearDown() throws Exception {
		testQueue = null;
	}
	
	@Test
	void testClear() {

		assertFalse(testQueue.isEmpty(),"Metod inte implementerad");
		
		testQueue.clear();
		
		assertTrue(testQueue.isEmpty(),"Metod inte implementerad");
		
	}
	
	@Test
	void testIsFull() {
		
		assertFalse(testQueue.isFull(),"Metod inte implementerad");
		
		testQueue.clear();
		
		assertFalse(testQueue.isFull(),"Metod inte implementerad");

	}
	
	@Test
	void testEnqueue() {
		testQueue.clear();
		
		assertTrue(testQueue.isEmpty(),"Metod inte implementerad");
		
		testQueue.enqueue(6);
		
		assertFalse(testQueue.isEmpty(),"Metod inte implementerad");

	}
	
	@Test
	void testDequeue() {

		assertFalse(testQueue.isEmpty(),"Metod inte implementerad");
		assertEquals( (double) testQueue.dequeue(), (double) 5,"Metod inte implementerad");
		assertEquals( (double) testQueue.dequeue(), (double) 4,"Metod inte implementerad");
		
		
	}
	
	@Test
	void testGetFront() {
		
		assertEquals( (double) testQueue.getFront(), (double) 5,"Metod inte implementerad");
		assertEquals( (double) testQueue.getFront(), (double) 5,"Metod inte implementerad");
		assertEquals( (double) testQueue.dequeue(), (double) 5,"Metod inte implementerad");
		assertEquals( (double) testQueue.getFront(), (double) 4,"Metod inte implementerad");
		

	}
	
	@Test
	void testDequeueOnEmptyQueue(){

		testQueue.clear();
		assertThrows(PriorityQueueEmptyException.class, 
				() -> testQueue.dequeue(), 
				"Expected: PriorityQueueEmptyException");
		
	}
	
	@Test
	void testGetFrontOnEmptyQueue(){
		testQueue.clear();
		assertThrows(PriorityQueueEmptyException.class, 
				() -> testQueue.getFront(), 
				"Expected: PriorityQueueEmptyException");
	}
	
	@Test
	void testEnqueueOnFullQueue(){
		
		assertFalse(testQueue.isFull(),"Metod inte implementerad");
		assertThrows(PriorityQueueFullException.class, 
				() -> testQueue.enqueue(6), 
				"Expected: PriorityQueueFullException");
	}

}
