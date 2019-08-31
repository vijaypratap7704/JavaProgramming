package singlylinklist;

// in the input of last node we reach to last node by using loop also

public class List3 {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public void firstinsert() {
		Node first = new Node(4);
		first.next = head;
		head = first;
	}
	public void printlist() {
		Node node = head;
		while(node!=null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	public void midadd(Node prev_node) {
		Node mid = new Node(2);
		mid.next = prev_node.next;
		prev_node.next = mid;
		
	}
	public void lastadd(Node last_node) {
		if(last_node.next != null)
			System.out.println("wrong information provided");
		else {
			Node last = new Node(24);
			last_node.next = last;
			last.next = null;
			}
	}
//	public void firstinsert() {
	//	Node first = new Node(4);
		//first.next = head;
//	}
	public static void main(String []args) {
		List3 list = new List3();
		list.head = new Node(6);
		
		Node second = new Node(1);
		
		Node third = new Node(7);

		list.head.next = second;
		
		second.next = third;
	
		third.next = null;
		//	list.printlist();
	
	list.firstinsert();
		
	list.midadd(second);
		list.lastadd(third);
		list.printlist();
	}
}
