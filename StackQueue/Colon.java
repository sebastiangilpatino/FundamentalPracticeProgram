package StackQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Colon {

	public static void main(String[] args) {
		LinkedList<Character> stackRight = new LinkedList<Character>();
		LinkedList<Character> queueLeft = new LinkedList<Character>();

		System.out.println("Input one String The input is supposed \n"
				+ "to consist of two parts separated by a colon ':'.As its result, we will print\n"
				+ "a single character as follows :\n" + "N      No colon on the line.\n"
				+ "L      The left part (before the colon) is longer than the right.\n"
				+ "R      The right part (after the colon) is longer than the left.\n"
				+ "D      The left and right parts have the same length but are different.\n"
				+ "S      The left and right parts are exactly the same.");
		System.out.print("Input-> ");

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int colon = 0;

		for (int i = 0; i < input.length(); i++) {
			char temp = input.charAt(i);
			if (temp == ':') { // detect if a colon exist.
				colon++;
			}
		}

		if (colon > 1) {
			System.out.println("More than 1 colon");
			System.exit(0);
		} else if (colon == 0) {
			System.out.println("N"); // colon not found
		}

		for (int i = 0; i < input.length(); i++) {
			char temp = input.charAt(i);
			if (temp == ':') { // detect the end of the left side.
				break;
			}

			queueLeft.add(temp);// add to the queue the part of the left colon
		}

		for (int i = input.length() - 1; i >= 0; i--) {
			char temp = input.charAt(i);
			if (temp == ':') {// detect the end of the right side.
				break;
			}

			stackRight.push(temp);// add to the stack the part of the right colon
		}

		if (queueLeft.size() > stackRight.size()) {
			System.out.println("L");
		} else if (stackRight.size() > queueLeft.size()) {
			System.out.println("R");
		} else if (equalStackQueue(queueLeft, stackRight) == true) {
			// method to know if the content of the queue and stack is the same
			System.out.println("S");
		} else if (stackRight.size() == queueLeft.size() && equalStackQueue(queueLeft, stackRight) == false) {
			System.out.println("D");
		}
	}

	public static boolean equalStackQueue(LinkedList<Character> queueLeft, LinkedList<Character> stackRigth) {
		Iterator<Character> queueLeftIterator = queueLeft.iterator();
		Iterator<Character> stackRigthIterator = stackRigth.iterator();
		String left = "", rigth = "";
		// two iterator one for each side, that help in save the elements of the stack
		// or queue in a string to compare
		while (queueLeftIterator.hasNext()) {
			left += queueLeftIterator.next();
		}

		while (stackRigthIterator.hasNext()) {
			rigth += stackRigthIterator.next();
		}

		if (rigth.equals(left)) { // compare strings
			return true;
		} else {
			return false;
		}

	}

}
