import java.util.Scanner;

public class PrtcStrBuf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a String and bye will be append");
		System.out
				.println("also all lowercase letters will be uppercase, and all uppercase letters will be lowercase: ");
		StringBuffer strBuf = new StringBuffer(sc.nextLine());
		sc.close();

		for (int i = 0; i < strBuf.length(); i++) {
			if (strBuf.charAt(i) >= 'a' && strBuf.charAt(i) <= 'z') {
				strBuf.setCharAt(i, Character.toUpperCase(strBuf.charAt(i)));
			} else if (strBuf.charAt(i) >= 'A' && strBuf.charAt(i) <= 'Z') {
				strBuf.setCharAt(i, Character.toLowerCase(strBuf.charAt(i)));
			}
		}

		strBuf.append(" bye");

		System.out.print(strBuf.toString());

	}

}
