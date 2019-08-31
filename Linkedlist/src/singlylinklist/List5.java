package singlylinklist;

public class List5 {
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
	public void delete(int index) {
		Node node = head;
		Node prev = null;
		if(index == 0) {
			head = head.next;
			return;}
		for(int i = 0;i<index;i++) {
			prev = node;
			node = node.next;
		}
		prev.next = node.next;
	}
	public void printlist() {
		Node node = head;
		while(node!= null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	public static void main(String []args) {
			List5 list = new List5();
			list.push(2);
			list.push(3);
			list.push(4);
			list.push(5);
			list.push(6);
			list.delete(3);
			list.printlist();
		}
	}
