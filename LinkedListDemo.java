
public class LinkedListDemo {
	public static void main(String[] args) {
		linkedList linked_list = new linkedList();
		linked_list.addAtStart(5);
		linked_list.addAtStart(10);
		linked_list.addAtStart(15);
		linked_list.addAtStart(20);
		linked_list.addAtStart(25);
		
		System.out.println(linked_list);
		System.out.println(linked_list.length());
		
	}
}
