package MyLinkedListLevel2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Operations {

	List<StringCharLinky> linkyList = new ArrayList<StringCharLinky>();;

	public void Readstring(String name, String content) {
		linkyList.add(new StringCharLinky(name));
		linkyList.get(linkyList.size() - 1).String2LinkedList(content);
	}

	public String writeString(String search) {
		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(search)) {
				return linkyList.get(i).toString();
			}
		}

		return "Not Found";
	}

	public void clear(String search) {
		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(search)) {
				linkyList.get(i).clear();
			}
		}
	}

	public void len(String search) {
		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(search)) {
				System.out.println(linkyList.get(i).getLengthLinkedList());
			}
		}
	}

	public boolean equals(String data1, String data2) {

		List<Character> list1 = new LinkedList<Character>();
		List<Character> list2 = new LinkedList<Character>();

		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(data1)) {
				list1.addAll(linkyList.get(i).getLinkedList());
			}
		}

		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(data2)) {
				list2.addAll(linkyList.get(i).getLinkedList());
			}
		}

		Object next1, next2;
		String str1 = "", str2 = "";
		Iterator it1 = list1.iterator();
		Iterator it2 = list2.iterator();

		while (it1.hasNext()) {
			next1 = it1.next();
			str1 += next1;
		}

		while (it2.hasNext()) {
			next2 = it2.next();
			str2 += next2;
		}

		if (str1.equals(str2)) {
			return true;
		} else {
			return false;
		}

	}

	public void concatenate() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter target name-> ");
		String data1 = scan.nextLine();
		System.out.println("enter name 2-> ");
		String data2 = scan.nextLine();
		List<Character> list1 = new LinkedList<Character>();

		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(data2)) {
				list1 = linkyList.get(i).getLinkedList();
			}
		}

		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(data1)) {
				linkyList.get(i).getLinkedList().addAll(list1);
			}
		}
	}

	public void insert() {
		int start = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter target name-> ");
		String data1 = scan.nextLine();
		System.out.println("enter name 2-> ");
		String data2 = scan.nextLine();
		System.out.println("enter index start-> ");

		try {
			start = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException numb) {
			System.out.println("Error: index must be numeric");
		}

		List<Character> list1 = new LinkedList<Character>();

		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(data2)) {
				list1 = linkyList.get(i).getLinkedList();
			}
		}

		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(data1)) {
				linkyList.get(i).getLinkedList().addAll(start, list1);
			}
		}
	}

	public int search() { // Q:?
		int start = 0;
		int counter = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("enter char to search-> ");
		String data1 = scan.nextLine();
		System.out.println("enter name-> ");
		String data2 = scan.nextLine();
		System.out.println("enter index start-> ");

		try {
			start = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException numb) {
			System.out.println("Error: index must be numeric");
		}

		int j = start;

		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(data2)) {

				for (; j < linkyList.get(i).getLengthLinkedList(); j++) {
					if (linkyList.get(i).getLinkedList().get(j).equals(data1.charAt(0))) {
						return j;
					}
				}

			}
		}

		return -1;

	}

	public void delete() throws Exception {

		int start = 0, span = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("enter name1-> ");
		String name = scan.nextLine();

		try {
			System.out.println("enter start index-> ");
			start = Integer.parseInt(scan.nextLine());

			System.out.println("enter length of span-> ");
			span = Integer.parseInt(scan.nextLine());

			if (span < 0 || start < 0) {
				throw new Exception("input must be positive");
			}

		} catch (NumberFormatException numb) {
			System.out.println(numb.getMessage());
			System.out.println("Error: index must be integer");
		}

		int count = 0;

		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(name)) {

				if (start > linkyList.get(i).getLengthLinkedList()) {
					System.out.println(start + " greater than string size");
					return;
				}

				if (start + span > linkyList.get(i).getLengthLinkedList()) {
					System.out.println(start + "+" + span + " greater than string size");
					return;
				}

				while (count != span) {
					linkyList.get(i).getLinkedList().remove(start);
					count++;
				}
			}
		}

	}

	public void substring() throws Exception {
		int start = 0, span = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("enter target-> ");
		String name = scan.nextLine();

		try {
			System.out.println("enter start index-> ");
			start = Integer.parseInt(scan.nextLine());

			System.out.println("enter length of span-> ");
			span = Integer.parseInt(scan.nextLine());

			if (span < 0 || start < 0) {
				throw new Exception("input must be positive");
			}

		} catch (NumberFormatException numb) {
			System.out.println(numb.getMessage());
			System.out.println("Error: index must be integer");
		}

		List<Character> list1 = new LinkedList<Character>();

		for (int i = 0; i < linkyList.size(); i++) {
			if (linkyList.get(i).getName().equals(name)) {

				if (start > linkyList.get(i).getLengthLinkedList()) {
					System.out.println(start + " greater than string size");
					return;
				}

				if (start + span > linkyList.get(i).getLengthLinkedList()) {
					System.out.println(start + "+" + span + " greater than string size");
					return;
				}

				for (int j = start; j < start + span; j++) {
					list1.add(linkyList.get(i).getLinkedList().get(j));
				}
			}
		}

		System.out.println(list1.toString());

	}
}
