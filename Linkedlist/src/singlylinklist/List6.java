package singlylinklist;

public class List6 {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	void delete() {
		head = null;
	}
	public void printlist() {
		Node node = head;
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	public static void main(String []args) {
		List6 list = new List6();
		list.push(3);
		list.push(7);
		list.push(9);
		list.push(6);
		list.printlist();
		list.delete();
		list.printlist();
	}

}
