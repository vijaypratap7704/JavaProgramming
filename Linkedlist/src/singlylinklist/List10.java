package singlylinklist;

public class List10 {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public int length() {
		int length = 1;
		Node node = head;
		while(node.next != null) {
			length++;
			node = node.next;
		}
		return length;
	}
	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	public void get_nth_from_last(int index,int length) {
		Node node = head;
		for(int i = 0;i<length-index;i++ ) {
			node = node.next;
		}
		System.out.println("data is "+ node.data);
	}
	public static void main(String []args) {
		List10 list = new List10();
		list.push(2);
		list.push(3);
		list.push(7);
		list.push(8);
		list.push(3);
		int x= list.length();
		System.out.println(x);
		list.get_nth_from_last(1,x-1);
	}
}
