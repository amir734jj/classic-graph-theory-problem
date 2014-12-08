import java.util.LinkedList;

public class GenQueue<E> {
	private LinkedList<E> list = new LinkedList<E>();

	public void enqueue(E item) {
		list.addLast(item);
	}

	public E dequeue() {
		return list.poll();
	}

	public boolean hasItems() {
		return !list.isEmpty();
	}

	public int size() {
		return list.size();
	}

	public void addItems(GenQueue<? extends E> q) {
		while (q.hasItems())
			list.addLast(q.dequeue());
	}

	public boolean isEmpty() {
		if (list.isEmpty())
			return true;
		else
			return false;
	}

	public boolean contains(E item) {
		return list.contains(item);
	}
}