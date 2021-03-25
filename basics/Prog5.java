import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a name the program will reverse the word:  ");
		System.out.println(reverseStr(sc.nextLine()));

		System.out.println("please input a String the program will count number of x :  ");
		System.out.println(numberOfX(sc.nextLine()) + " 'x' Characters");

		sc.close();

	}

	public static String reverseStr(String str) {
		String output = "";

		// for loop goes from last one to the first one
		for (int i = str.length() - 1; i >= 0; i--) {
			output += str.charAt(i);
		} // reversing the String concatenating the output.

		return output;
	}

	public static int numberOfX(String s1) {
		int contX = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.substring(i, i + 1).equals("x") == true) {
				contX++;
			} // if the string has an X the counter sums
		}
		return contX;
	}

}
