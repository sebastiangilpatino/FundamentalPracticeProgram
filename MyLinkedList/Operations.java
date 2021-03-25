package MyLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Operations {

	List<StringCharLinky> linkyList = new ArrayList<StringCharLinky>(); // Collection of a Class StringCharLinky
																		// that storage class that has
																		// 1 linkedList and 1 String name fields

	public boolean Readstring(String name, String content) {

		/*
		 * Validate if the name already exist, if dont, create a object StringCharLinky
		 * the constructor receive just the name of the class, afterwards, add the
		 * object to the Collection of this class. Finally, call a method that storage
		 * the string in a linked list inside the object StringCharLinky
		 */

		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(name)) {
				System.out.println("The name already exists");
				return false;
			}
		}

		linkyList.add(new StringCharLinky(name));
		linkyList.get(linkyList.size() - 1).String2LinkedList(content);
		return true;
	}

	public String writeString(String search) {

		/*
		 * validate if the object with that name exist in the Collection , when found
		 * it, call a method that converts LinkedList to String in object
		 * StringCharLinky. if don't return not found
		 */

		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(search)) {
				return linkyList.get(i).toStringLinkedList();
			}
		}

		return "Not Found";
	}

	public boolean clear(String search) {

		/*
		 * Validate if the object with that name exist in the Collection , when found
		 * it, call a method of object StringCharLinky that clears the LinkedList. if
		 * don't return false
		 */

		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(search)) {
				linkyList.get(i).clearLinkedList();
				return true;
			}
		}

		return false;
	}

	public int len(String search) {
		/*
		 * Validate if the object with that name exist in the Collection , when found
		 * it, call a method of object StringCharLinky that returns the length of the
		 * LinkedList. if don't return -1
		 */
		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(search)) {
				return linkyList.get(i).getLengthLinkedList();
			}
		}

		return -1;
	}

	public boolean equals(String data1, String data2) {
		// create two temporal List to handle the input data

		List<Character> list1 = new LinkedList<Character>();
		List<Character> list2 = new LinkedList<Character>();
		boolean found1 = false, found2 = false;
		// two boolean flags to know if the element was found or not.

		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(data1)) { // if the element with that name is found
				list1.addAll(linkyList.get(i).getLinkedList()); // add to the temp list1 all the linkedList.
				found1 = true; // convert flag1 because was found the object.
			}
		}

		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(data2)) {
				list2.addAll(linkyList.get(i).getLinkedList());
				found2 = true;
			}
		}

		if (found1 && found2) { // verify that both objects exist if dont just exit.

			if (list1.size() != list2.size()) {
				return false;
			}

			Iterator it1 = list1.iterator(), it2 = list2.iterator();

			while (it1.hasNext()) {
				if (it1.next().equals(it2.next()) == false) {
					return false;
				} // two iterator that passed the linkedlist to string
			}

			return true;

		} else {
			System.out.println("Name not found");
			return false;
		}
	}
}
