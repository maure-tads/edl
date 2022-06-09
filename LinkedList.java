public class LinkedList<T> {

	private Node<T> head;
	private Node<T> tail;

	public void add(T o) {
		if (head == null) {
			head = new Node<T>(o);
			tail = head;
			return;
		}
		Node<T> newTail = new Node<T>(o);
		tail.setNext(newTail);
		tail = newTail;
	}

	public void addFirst(T o) {
		Node<T> newHead = new Node<T>(o);
		newHead.setNext(head);
		head = newHead;
	}

	public void print() {
		Node<T> el = head;
		while(el != null) {
			System.out.println(el.getData() + ": " + el);
			el = el.getNext();
		}
	}


	static class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
		}

		public T getData() {
			return this.data;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		public Node<T> getNext() {
			return this.next;
		}
	}
}