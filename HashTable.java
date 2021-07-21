package HashTable;

public class HashTable {
	public static void main(String[] args) {
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidabe situations";
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}
		System.out.println(myHashMap);
	}
}
