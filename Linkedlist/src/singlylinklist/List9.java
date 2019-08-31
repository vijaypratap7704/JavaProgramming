package singlylinklist;

public class List9 {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public void getNthnode(int index) {
		Node node = head;
		for(int i=0;i<index;i++) {
			node = node.next;
		}
		System.out.println("data of index number " + index + " is "+node.data);
	}
	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	public static void main(String []args) {
		List9 list = new List9();
		list.push(2);
		list.push(3);
		list.push(5);
		list.push(6);
		list.push(7);
		list.push(9);
		list.getNthnode(3);
	}
}
