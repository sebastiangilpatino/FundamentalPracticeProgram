package StackQueue;

import java.util.LinkedList;
import java.util.Scanner;

public class Delimiters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Character> delimiters = new LinkedList<Character>();
		System.out.println("please introduce an equation");
		System.out.println("we will test the delimiter matching algorithm");
		int cont = 0; // counter to verify that all the pushed items were poped
		String input = sc.nextLine();

		for (int i = 0; i < input.length(); i++) {
			char temp = input.charAt(i);

			// if some of this character is detected add to the stack
			if (temp == '(' || temp == '[' || temp == '{') {
				delimiters.push(temp);
				cont++;
			}

			// detect the other character to found the couple
			if (temp == ')') {
				char endDelimiter = delimiters.pop();
				if (endDelimiter != '(') {
					System.out.println("error");
				} else {
					cont--;
				}
			}

			// detect the other character to found the couple
			if (temp == ']') {
				char endDelimiter = delimiters.pop();
				if (endDelimiter != '[') {
					System.out.println("error");
				} else {
					cont--;
				}
			}

			// detect the other character to found the couple
			if (temp == '}') {
				char endDelimiter = delimiters.pop();
				if (endDelimiter != '{') {
					System.out.println("error");
				} else {
					cont--;
				}
			}
		}

		if (cont == 0) {
			System.out.println("okay");
		}
		// (a + b[(x+y)] + 10)
	}

}
