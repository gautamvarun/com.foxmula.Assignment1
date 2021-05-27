import java.util.*;
public class Stack {
	private Node top;
	private int size;
	
	private class Node{
		
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(int data) {
		
		Node tempNode = new Node(data);
		tempNode.next = top;
		top  = tempNode;
		size++;
		
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		int result = top.data;
		top = top.next;
		size--;
		return result;
	}
	
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}



