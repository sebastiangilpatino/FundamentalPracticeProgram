package MyLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StringCharLinky {

	private String name; // name of the class
	private List<Character> linky = new LinkedList<Character>(); // content of the class

	public StringCharLinky(String name) {
		this.name = name;
	}// constructor just receive the name of the class

	public String getName() {
		return this.name;
	}

	public List<Character> getLinkedList() {
		return linky;
	}// return the content of the class (linkedList)

	public void String2LinkedList(String str1) {
		for (int i = 0; i < str1.length(); i++) {
			linky.add(str1.charAt(i));
		}
	}// convert the string in char and add to the linkedList.

	public void clearLinkedList() {
		Iterator it = linky.iterator();
		while (it.hasNext()) {
			it.next();
			it.remove();
		}
	}// clear the linked list iterating by nodes

	public int getLengthLinkedList() {
		int output = 0;
		Iterator it = linky.iterator();
		while (it.hasNext()) {
			it.next();
			output++;
		}
		return output;
	}// return the size of the linked list with a iterator

	public String toStringLinkedList() {
		String output = "";
		Iterator it = linky.iterator();
		while (it.hasNext()) {
			output += it.next() + " ";
		}
		return output;
	}// return a String with the sum of all the nodes of the linked List.
}
