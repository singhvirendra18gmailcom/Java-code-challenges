package collection;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ReverseSingleLinkedList<T> {

	private Node<T> head;

	public ReverseSingleLinkedList() {

	}

	public String toString() {
		StringBuffer toReturn = new StringBuffer("[");
		Node<T> tempHead = head;
		if (tempHead != null) {
			toReturn.append(tempHead.getElement());
			while (tempHead.getNext() != null) {
				tempHead = tempHead.getNext();
				toReturn.append(", ").append(tempHead.getElement());

			}
		}
		toReturn.append("]");
		return toReturn.toString();
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public T add(T data) {
		if (data == null) {
			return null;
		}
		Node<T> n = new Node<T>(data, null);
		Node<T> tempHead = head;
		if (tempHead == null) {
			tempHead = n;
			head = tempHead;
		} else {
			while (tempHead.getNext() != null) {
				tempHead = tempHead.getNext();
			}

			tempHead.setNext(n);
		}
		return data;
	}

	public T remove(T data) {

		Node<T> tempHead = head;
		Node<T> previous = head;

		if (tempHead == null) {
			return null;
		} else {

			while (tempHead != null) {
				if (tempHead.getElement().equals(data)) {
					previous.setNext(tempHead.getNext());
					break;
				}
				previous = tempHead;
				tempHead = tempHead.next;
			}
		}
		return data;
	}

	 public void reverse() {
	        Node<T> prev = null;
	        Node<T> current = head;
	        Node<T> next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        head = prev;
	        
	    }

	@Test
	public void test() {
		ReverseSingleLinkedList<String> list = new ReverseSingleLinkedList<>();
		System.out.println(list);

		System.out.println("-----------------------------");

		assertTrue("Hello".equalsIgnoreCase(list.add("Hello")));
		assertTrue("Saty".equalsIgnoreCase(list.add("Saty")));
		assertTrue("vir".equalsIgnoreCase(list.add("vir")));
		assertTrue(null == list.add(null));

		assertTrue("Man".equalsIgnoreCase(list.add("Man")));

		System.out.println(list);

		System.out.println("-----------------------------");
		assertTrue("vir".equalsIgnoreCase(list.remove(("vir"))));
		System.out.println(list);
		
		System.out.println("-----------------------------");
		list.reverse();
		System.out.println(list);

	}

	private class Node<T> {
		private T element;
		private Node<T> next;

		public T getElement() {
			return element;
		}

		public void setElement(T element) {
			this.element = element;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		public Node(T element, Node<T> next) {
			this.element = element;
			this.next = next;
		}

	}

}
