package dataStructures;

class Node {
	int value;
	Node next;

	Node() {
		this.value = 0;
		this.next = null;
	}

	Node(int value) {
		this.value = value;
		this.next = null;
	}

	public int getValue() {
		return value;
	}

	public Node getNextNode() {
		return next;
	}
}

class LinkedList {
	Node head;
	Node tail;

	LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public boolean add(int value) {

		if (head == null) {
			head = new Node(value);
			tail = head;
			return true;
		} else {

			Node next = findNextNode(tail.getNextNode(), value);
			tail.next = next;
			tail = next;

			return true;
		}

	}

	public void printAll() {

		if (head == null) {
			System.out.println("no data found");
		} else {
			System.out.println(head.value);
			readNextNode(head.getNextNode());

		}
	}

	private void readNextNode(Node nextNode) {

		if (nextNode != null) {

			System.out.println(nextNode.value);
			readNextNode(nextNode.next);
		}

	}

	private Node findNextNode(Node next, int value) {
		Node currentNode = null;
		if (next == null) {
			currentNode = new Node(value);
		} else {
			currentNode = findNextNode(next.getNextNode(), value);
		}

		return currentNode;

	}
}

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList  ll = new LinkedList();
		ll.add(6);
		ll.add(7);
		ll.add(8);
		
		ll.printAll();
	}

}
