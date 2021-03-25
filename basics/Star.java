import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		System.out.println("Introduce the base and height of the triangle");
		System.out.println("the software will draw it:  ");

		Scanner sc = new Scanner(System.in);
		try {
			int size = Integer.parseInt(sc.nextLine());
			sc.close();

			for (int i = 0; i <= size; i++) { // goes through the row
				for (int j = 0; j < i; j++) { // same number of row
					if (i > 2 && j > 0 && j < i - 1 && i < size) { // condition to draw the spaces
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				System.out.println(""); // Line jump
			}
		} catch (Exception e) {
			System.out.print("Not number, please restart");
		}
	}

}
