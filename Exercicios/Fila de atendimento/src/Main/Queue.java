package Main;

public class Queue {
	
	public Node first;
	public Node last;
	public int lenght;
}
	
	public class Node{
		
		int value;
		
		Node next;
		
		
		Node(int value)	{
			this.value = value;
		}
		
		public void Queue(int value) {
			Node newNode = new Node(value);
			first = newNode;
			last = newNode;
			length++;
		}
		
		public void getFirst() {
			if (firt != null) {
				System.out.println("First: " + first.value);
			}else {
				System.out.println("Fila está vazia ");
			}
		}
		
		public void getLast() {
			if (last != null) {
				System.out.println("Last: " + last.value);
			}else {
				System.out.println("Fila está vazia ");
			}
		}
		
		
		public void getLength() {
			System.out.println("Length" + length);
		}
		
		public void print() {
			Node temp = first;
			while(temp != null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
		}
		
	public static void main(String[] args) {
		Queue myqueue
	}
}

	
