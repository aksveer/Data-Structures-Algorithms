
public class linkedList {
	private Node head;
	
	public void addAtStart(int data) {
		Node newNode = new Node(data);
		newNode.setNext(this.head);
		if(this.head != null) {
			this.head.setPrevious(newNode);
		}
		
		this.head = newNode;
	}
	
	public int length() {
		Node current = this.head;
		int count = 0;
		while(current!=null) {
			count++;
			current = current.getNext();
		}
		return count;
	}
	
	public String toString() {
		String result = "";
		Node current = this.head;
		while (current != null) {
			result  += "Node :" +  current.getData() + "\n";
			current = current.getNext();
		}
				
		return result;
		
	}
}
