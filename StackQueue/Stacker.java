package StackQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Stacker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 1;
		LinkedList<Integer> listInteger = new LinkedList<Integer>();

		System.out.println("Please add some positive Integers to reverse");
		System.out.println("add negative number to stop");

		while (number > 0) {

			try { // catch if the user input another character
				number = Integer.parseInt(sc.nextLine());
				if (number > 0) { // just add to the stack the numbers greater than 0
					listInteger.push(number);
				}
			} catch (NumberFormatException numb) {
				System.out.println("Not Number");
			}

		}

		Iterator<Integer> it = listInteger.iterator();
		int count = 0;
		int size = listInteger.size();// obtain the size of the array.

		System.out.print("The integers reversed are: ");
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
			count++; // counter to know the actual position of the iterator
			if (count == size - 1) { // detect the second last number to add "and"
				System.out.print("and ");
			}
		}
	}

}
