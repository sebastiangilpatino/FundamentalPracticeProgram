import java.util.Scanner;

public class Upper2Lower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Introduce a Sentence, the program will change");
		System.out.println("the lower case letter to uppercase letters and the");
		System.out.println("uppercase letters to lower case: ");
		String word = sc.nextLine();
		sc.close();

		char[] wordChar = word.toCharArray(); // convert the String to char array
		word = ""; // initialize word.

		for (int i = 0; i < wordChar.length; i++) {
			if (wordChar[i] >= 'a' && wordChar[i] <= 'z') {
				wordChar[i] = Character.toUpperCase(wordChar[i]); // change the corresponding letter
			} else if (wordChar[i] >= 'A' && wordChar[i] <= 'Z') {
				wordChar[i] = Character.toLowerCase(wordChar[i]); // change the corresponding letter
			}

			word += wordChar[i]; // concatenate each letter to make the new String
		}

		System.out.println(word);

	}

}
