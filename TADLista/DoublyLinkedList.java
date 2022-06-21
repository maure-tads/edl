public class DoublyLinkedList<T> implements Lista<T> {

	private Position<T> head, tail;
	private int size;

	public DoublyLinkedList(Position<T> head, Position<T> tail, int size) {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void add(T o) {
		size++;
		if (head == null) {
			head = new Position<T>(o);
			tail = head;
			return;
		}
		Position<T> newTail = new Position<T>(o);
		newTail.setPrev(tail);
		tail.setNext(newTail);
	}

	public void insertFirst(T o) {
		Position<T> newHead = new Position<T>(o);
		newHead.setNext(head);
		head.setPrev(newHead);
		head = newHead;
		size++;
	}

	public void insertLast() {
		tail = tail.getPrev();
		tail.getNext().setPrev(null);
		tail.setNext(null);
		size--;
	}
	
	public void removeFirst() {
		size--;
		if(head == null) throw new EmptyListExcpetion();
		if(head.getNext() == null) {
			head = null;
			return;
		}
		head = head.getNext();
		head.getPrev().setNext(null);
		head.setPrev(null);
	}

	public Position<T> remove(Integer i) {
		size--;
		Position<T> el = head;
		int j = 0;
		while(j < i) {
			if(el == null) throw new IndexOutOfBoundsException();
			el = el.getNext();
			j++;
		}
		return el;
	}
	
	public T remove(Position<T> p) {
		size--;
		T t = p.getData();
		p.getPrev().setNext(p.getNext());
		p.getNext().setPrev(p.getPrev());
		p.setPrev(null);
		p.setNext(null);
		return t;
	}

	public void printObj() {
		Position<T> el = head;
		while(el != null) {
			System.out.println(el.getData() + ": " + el);
			el = el.getNext();
		}
	}

	public void print() {
		Position<T> el = head;
		while(el != null) {
			System.out.print(el.getData());
			el = el.getNext();
			if(el != null) System.out.print(", ");
		}
		System.out.println();
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public T first() {
		return head == null ? null : head.getData();
	}

	@Override
	public T last() {
		return tail == null ? null : tail.getData();
	}

	@Override
	public T before(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T after(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void replaceElement(Position<T> n, T data) {
		Position<T> el = head;
		while(el != null) {
			el = el.getNext();
		}
		
	}

	@Override
	public void swapElements(Position<T> n, Position<T> q) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertBefore(Position<T> n, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertAfter(Position<T> n, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertLast(T o) {
		// TODO Auto-generated method stub
		
	}


	
}