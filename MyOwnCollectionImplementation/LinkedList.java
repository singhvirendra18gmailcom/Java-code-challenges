public class LinkedList<T> {

	private Node<T> head;
	private Node<T> tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public void add(T data) {
		Node<T> node = new Node<T>(data, null, null);
		Node<T> current=null;
		if (head == null && tail == null) {
			head = node;
			tail = node;
			head.setPrevious(null);
			head.setNext(null);
			tail.setNext(null);
			tail.setPrevious(null);
			
		} else {
			tail=node;
			current=head;
			while(current.getNext()!=null) {
				current=current.getNext();
			}
			current.setNext(tail);
			tail.setPrevious(current);
		}
	}

	public String toString() {
		StringBuffer toReturn = new StringBuffer("[");
		Node<T> curr = head;
		while (curr!=null) {
			toReturn.append(curr.getData()).append(" , ");
			curr=curr.getNext();

		}
		toReturn.append("]");
		return toReturn.toString();
	}

	private class Node<T> {

		private T data;
		private Node<T> previous;
		private Node<T> next;

		public Node(T data, Node<T> previous, Node<T> next) {
			super();
			this.data = data;
			this.previous = previous;
			this.next = next;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getPrevious() {
			return previous;
		}

		public void setPrevious(Node<T> previous) {
			this.previous = previous;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		
	}
	
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		System.out.println(list);
		list.add("Hello");
		list.add("ajay");
		list.add("jay");
		list.add("vijay");
		list.add("Sanjay");
		System.out.println("========================");
		System.out.println(list);
		
		
	}
}
