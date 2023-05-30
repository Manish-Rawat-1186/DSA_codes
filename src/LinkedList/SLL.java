package LinkedList;

public class SLL {
	Node head;
	int size = 0;

	public void insert(int data){
		Node node = new Node();
		node.data = data;
		node.next = null;

		if(head == null){
			head = node;
		}else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = node;
		}
		size += 1;

	}
	public void insertAtStart(int data){
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head != null) {
			node.next = head;
		}
		head = node;
		size += 1;
	}

	public void insertAtIndex(int index, int data){
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(index > size) return;

		Node temp =head;
		int count = 1;

		while(count < index-1){
			temp = temp.next;
			count++;
		}
		node.next = temp.next;
		temp.next = node;
		size += 1;
	}

	public void delete(){
		Node temp = head;
		while (temp.next != null && temp.next.next != null){
			temp = temp.next;
		}
		if(temp.next == null) {
			System.out.println(temp.data);
			head = null;
		}
		else {
			System.out.println(temp.next.data);
			temp.next = null;
		}
		size -= 1;
	}

	public void deleteAtIndex(int index){
		if(index > size) return;
		Node temp = head;
		int count = 1;
		while(count < index-1){
			temp = temp.next;
			count++;
		}
		System.out.println(temp.next.data);
		temp.next = temp.next.next;
		size -= 1;
	}

	public void deleteAtStart(){
		if (head == null) return;
		System.out.println(head.data);
		head = head.next;
		size -= 1;
	}

	public void show(){
		if (head == null) System.out.println("Empty");
		Node temp = head;
		while (temp.next != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}





}
