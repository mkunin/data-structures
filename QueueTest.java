/*
 *  File: QueueTest.java
 */

public class QueueTest extends Queue {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(7);
		q.enqueue(0);
		q.enqueue(1);
		q.enqueue(2);
		q.dequeue();
		q.print(); // [0| ]->[1| ]->[2|/]
	}
	
}
	