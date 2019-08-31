package singlylinklist;

public class List4 {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	//public Node searchnode(int key) {
	//	Node node = head;
//		Node prev = null;
	//	while(node.data != key && node!=null) {
//			node = node.next;
		//}
		//return prev;
	//}
	public void deletenode(int key) {
		if(head.next == null)
			return;
		Node prev = null;
		Node node = head;
		while(node.data != key) {
			prev = node;
			node = node.next;	
		}
		prev.next = node.next;
	}
	public void printlist() {
		Node node = head;
		while(node!=null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	public static void main(String []args) {
			List4 list = new List4();
			list.head = new Node(2);
			Node second = new Node(5);
			Node third = new Node(7);
			Node fourth = new Node(9);
			list.head.next = second;
			second.next = third;
			third.next = fourth;
			fourth.next = null;
			int k = 7;
		//	list.searchnode(k);
			list.deletenode(k);
			list.printlist();
	}
}
