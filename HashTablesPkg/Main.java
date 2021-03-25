package HashTablesPkg;

public class Main {

	public static void main(String[] args) {
		MyHashtable hashtable = new MyHashtable(10);
		hashtable.put("Jhon Doe", "641-111-1111");
		hashtable.put("Jhon Doe", "641-111-1111");
		hashtable.put("Maria Doe", "641-222-2222");
		hashtable.put("Jorge Doe", "641-333-3333");
		hashtable.put("Tom Doe", "641-444-4444");
		hashtable.put("Xiom Doe", "641-555-5555");
		hashtable.put("Leid Doe", "641-666-6666");
		hashtable.put("Stel Doe", "641-777-7777");
		hashtable.put("Alvar Doe", "641-888-8888");
		hashtable.put("Loren Doe", "641-999-9999");

		System.out.println(hashtable.toString());
		System.out.println("Elements added: " + hashtable.getLinkedListSize());
		System.out.println("Biggest linkedlist: " + hashtable.numberElementsBiggerLinkedList());
		System.out.println("empty cells: " + hashtable.arrayCellsEmpty());
	}

}
