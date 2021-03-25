import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Introduce a String the system will say if is a Palindrome");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();
		System.out.println(isPalindrome(word));
	}

	public static String isPalindrome(String word) {
		if (word.length() == 0) { // if no characters
			return "No letters";
		}

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
				return "Not Palindrome";
			}
		} // compare the (first) i letter with the lastone-i, and so on
			// if dont return not palindrome.

		return "Palindrome";
	}

}
