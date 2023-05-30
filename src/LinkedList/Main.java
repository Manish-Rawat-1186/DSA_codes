package LinkedList;

public class Main {
	public static void main(String[] args) {
		SLL list = new SLL();
		list.insert(5);
		list.insert(12);
		list.insert(6);
		list.insert(9);
		list.insert(8);
		list.insert(5);
		list.show();
		list.insertAtIndex(3,12);
		list.show();
		list.insertAtStart(18);
		list.show();
		list.delete();
		list.show();
		list.deleteAtIndex(3);
		list.show();
		list.deleteAtStart();
		list.show();

	}
}
