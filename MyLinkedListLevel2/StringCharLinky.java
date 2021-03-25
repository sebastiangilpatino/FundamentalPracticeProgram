package MyLinkedListLevel2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StringCharLinky {

	private String name;
	private List<Character> linky = new LinkedList<Character>();

	public StringCharLinky(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public List<Character> getLinkedList() {
		return linky;
	}

	public void String2LinkedList(String str1) {
		for (int i = 0; i < str1.length(); i++) {
			linky.add(str1.charAt(i));
		}
	}

	public void clear() {
		linky.clear();
	}

	public int getLengthLinkedList() {
		int output = 0;
		Object next;
		Iterator it = linky.iterator();
		while (it.hasNext()) {
			next = it.next();
			output++;
		}
		return output;
	}

	@Override
	public String toString() {
		String output = "";
		Object next;
		Iterator it = linky.iterator();
		while (it.hasNext()) {
			next = it.next();
			output += next + " ";
		}
		return output;
	}
}
