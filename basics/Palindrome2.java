import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		System.out.println("Introduce a String the system will say if is a Palindrome");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();
		System.out.println(isPalindrome(word));
	}

	public static String isPalindrome(String word) {
		Deque<Character> wordStack = new LinkedList<Character>();

		if (word.length() == 0) { // if no characters
			return "No letters";
		}

		for (int i = 0; i < word.length(); i++) {
			wordStack.push(word.charAt(i));
		}

		Iterator<Character> wordIterator = wordStack.iterator();
		int index = 0;
		while (wordIterator.hasNext()) {
			if (wordIterator.next() != word.charAt(index)) {
				return "Not Palindrome";
			}
			index++;

		}

		return "Palindrome";
	}

}
