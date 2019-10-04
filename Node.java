
public class Node {
	private Node next;
	private Node previous;
	public int data;
	
	public Node (int data) {
		this.data = data;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrevious() {
		return this.previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public int getData() {
		return this.data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
}
