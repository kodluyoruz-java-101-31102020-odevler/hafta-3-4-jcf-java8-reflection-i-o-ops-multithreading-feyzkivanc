package soru1.com.linkedList;

public class LinkedList <T> {
 
	
	public Node<T> first;
	public Node<T> last;
	public int count;
	
	public LinkedList() {
		Node<T> newLinked = new Node<T>();
		
		this.first=newLinked;
		this.last= this.first;
	}
	
	public void add(T data) {
		
		Node<T> newData = new Node<T>(data);
		if (this.first.getData() == null) {
			this.first = newData;
			this.last = this.first;
		} else {
			this.last.setNext(newData);
			this.last = newData;
		}
		count++;
		
		
		
		
	}
	public void remove(T data) {
		Node<T> current = first;
		if (this.first.getData().equals(data)) {
			if (this.first.getNext() == null) {
				Node<T> newNode = new Node<T>();
				this.first.setData(null);
				this.first = newNode;
				this.last = this.first;
			} else {
				this.first.setData(null);
				this.first = this.first.getNext();
			}
		} else {
			boolean wasDeleted = false;
			while (!wasDeleted) {
				Node<T> currentNext = current.getNext();
				if (currentNext.getData().equals(data)) {
					currentNext.setData(null);
					current.setNext(currentNext.getNext());
					currentNext = null;
					wasDeleted = true;
					count--;
				} else {
					current = current.getNext();
				}
			}
		}
	}

	public void print() {
		boolean allPrinted = false;
		Node<T> crr = first;
		System.out.print("[");
		while (!allPrinted) {
			if (crr.getData() != null) {
				if (crr.getNext() != null) {
					System.out.print(crr.getData().toString() + ",");
					Node<T> crrNext = crr.getNext();
					crr = crrNext;
				} else {
					System.out.print(crr.getData().toString() + "]");
					allPrinted = true;
				}
			} else {
				allPrinted = true;
			}
		}
		System.out.println();
	}

	public int getCount() {
		return count;
	}

	
	
}
