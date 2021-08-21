
public class Driver {
	
	public static void main(String[] args) {
		LinkedStack Stack = new LinkedStack();
		System.out.println("Result :\n");
		System.out.println("BottomHalf Of The Stack :");
		for (int i = 0; i < 10; i++)   // push elements from 0 to 10 
			Stack.push(i);
		Stack.removeBottomHlf();  //  call removeBottomHlf method to display  the result 
		System.out.println(Stack.toString());   

	}

}

class LinkedNode {
	public int item;
	public LinkedNode next;

	public LinkedNode(int i) {
		item = i;
	}
}

class LinkedStack {
	LinkedNode front = null;
	int count = 0;

    // implement push method
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
		newNode.next = front;
		front = newNode;
		count++;
	}
    // implement pop method 
	int pop() {
		int x = front.item;
		front = front.next;
		count--;
		return x;
	}

	public String toString() {
		String result = "";

		LinkedNode current = front;
		while (current != null) {
			result += current.item + " ";
			current = current.next;
		}

		return result;
	}

	void removeBottomHlf() {

		LinkedNode current = front;
		int size = count;

		while (size > (count / 2 + 1)) {
			current = current.next;
			size--;
		}
		current.next = null;

	}
}
