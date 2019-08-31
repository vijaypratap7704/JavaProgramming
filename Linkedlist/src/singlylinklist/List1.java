package singlylinklist;

public class List1 {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public static void main(String []args) {
		List1 list = new List1();
		list.head = new Node(9);
		Node second = new Node(4);
		Node third = new Node(7);
		list.head.next = second;
		second.next = third;
		third.next = null;
		list.printlist();
	}
	public void printlist(){
		Node node = head;
		do {
			System.out.println(node.data);
			node = node.next;
		}while(node!= null);
	}
}
