package singlylinklist;

public class List7 {
	static Node head;
	class Node{
		Node next;
		int data;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public int count(Node node) {
		if(node == null)
			return 0;
		return 1+count(node.next);
	}
	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	public static void main(String []args) {
		List7 list = new List7();
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);
		list.push(7);
		list.push(8);
		System.out.println(list.count(head));
	}
	

}
