
public class Driver1 {

	public static void main(String[] args) {

		ArrayStack stack = new ArrayStack(6);   

		System.out.println("Implementing Stacks Using ArrayStack");

		stack.push(1);   

		stack.push(7);

		stack.push(3);

		stack.push(4);

		stack.push(9);

		stack.push(2);
		
		int tos;
		do {
			tos = stack.pop();   
			if (tos == -1)
				break;      
			System.out.println(tos);

		} while (tos != -1);

		LinkedStack stack1 = new LinkedStack();    
		
		System.out.println("Implementing Stacks Using LinkedStack");
		
		stack1.push(1);    

		stack1.push(7);

		stack1.push(3);

		stack1.push(4);

		stack1.push(9);

		stack1.push(2);

		tos = stack1.pop();

		while (tos != -1) {
			System.out.println(tos);   
			tos = stack1.pop();
		}

	}

}


class ArrayStack {

	private int[] list;

	private int n;

	private int size;

	public ArrayStack(int x) {

		size = x;

		n = 0;

		list = new int[x];

	}

	
	public void push(int item) {

		if (n == size)

			System.out.println("Stack is Full");

		else {

			list[n] = item;

			n++;

		}

	}
   
	public int pop() {

    	int tos = -1;

		if (n == 0)

			System.out.println("Stack is Empty");

		else {

			tos = list[n - 1];

			n--;

		}

		return tos;   

	}

}

class LinkedStack {

	class Node {

		int data;    

		Node next;

		Node(int node) {

			data = node;

		}

	}

	private Node tos;

	private int n;

	public LinkedStack() {

		tos = null;

		n = 0;

	}
	
 
	public void push(int item) {

		Node newNode = new Node(item);

		newNode.next = tos;

		tos = newNode;

		n++;

	}

	public int size() {

		return n;

	}
    
	
	public int pop() {

		if (n == 0) {

			return -1;

		}

		int data = tos.data;

		tos = tos.next;

		n--;

		return data;

	}

}