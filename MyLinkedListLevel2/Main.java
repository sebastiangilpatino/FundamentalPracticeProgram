package MyLinkedListLevel2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		String option, name, content, search;
		Operations ope = new Operations();

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("R:Input a String, W:rite a String, C:clear, L: length");
			System.out.println("E:equals, Q:uit, K:concatenate, I: insert, S: search");
			System.out.println("D:elete, Z:substring \n");
			System.out.print("Enter command-> ");
			option = scan.nextLine();

			switch (option.toLowerCase()) {
			case "r":
				System.out.println("enter string name-> ");
				name = scan.nextLine();
				System.out.println("enter content string-> ");
				content = scan.nextLine();
				ope.Readstring(name, content);
				break;

			case "w":
				System.out.println("enter string name-> ");
				name = scan.nextLine();

				System.out.println(ope.writeString(name));
				break;

			case "c":
				System.out.println("enter string name-> ");
				name = scan.nextLine();
				ope.clear(name);
				break;

			case "l":
				System.out.println("enter string name-> ");
				name = scan.nextLine();

				ope.len(name);
				break;

			case "e":
				System.out.println("enter string name 1-> ");
				name = scan.nextLine();
				System.out.println("enter string name 2-> ");
				content = scan.nextLine();

				System.out.println(ope.equals(name, content));
				break;

			case "q":
				System.exit(0);
				break;

			case "k":
				ope.concatenate();
				break;

			case "i":
				ope.insert();
				break;

			case "s":
				System.out.println(ope.search());
				break;

			case "d":
				ope.delete();
				break;

			case "z":
				ope.substring();
				break;

			default:
				System.out.println("Incorrect input");
				break;
			}
		}

	}

}
