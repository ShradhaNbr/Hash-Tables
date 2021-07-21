package HashTable;

public class MyHashMap<K, V> {
	MyMapNode head;
	MyMapNode tail;
	/*
	 * Purpose : method to get value from LinkedList
	 *
	 * @param word : key is returned
	 */

	public V get(K key) {
		MyMapNode<K, V> myNode = search(key);
		return (myNode == null) ? null : myNode.getValue();
	}

	/*
	 * Purpose : Method to search the word in LinkedList is
	 * 
	 * @param : key to search
	 *
	 */

	public MyMapNode<K, V> search(K key) {
		MyMapNode<K, V> currentNode = head;
		int position = 0;
		while (currentNode != null) {
			position++;
			if (currentNode.getKey().equals(key)) {
				return currentNode;
			}
			currentNode = currentNode.getNext();
		}

		return currentNode;
	}

/*
 * Purpose : Method to add key and value to hash table
 * 
 * @param key : word to be added
 * 
 * @param value: frequency of word
 * 
 */
	public void add(K key, V value) {
		MyMapNode<K, V> myNode = search(key);
		if (myNode == null) {
			myNode = new MyMapNode<>(key, value);
			this.append(myNode);
		} else
			myNode.setValue(value);
	}

	private void append(MyMapNode<K, V> myNode) {
		if (this.head == null)
			this.head = myNode;
		if (this.tail == null)
			this.tail = myNode;
		else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	@Override
	public String toString() {
		return "MyHashMapNodes{" + head + '}';
	}
}
