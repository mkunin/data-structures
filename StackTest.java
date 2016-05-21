/*
 *  File: StackTest.java
 */

public class StackTest extends Stack {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.print(); // [2| ]->[1| ]->[0|/]
	}
	
}