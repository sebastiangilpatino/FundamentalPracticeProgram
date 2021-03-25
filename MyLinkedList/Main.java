package MyLinkedList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		String option, name, content;
		Operations ope = new Operations();

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("\nR:Input String, W:rite a String, C:lear");
			System.out.println("L:ength, E:quals, Q:uit");
			System.out.print("Enter command-> ");
			option = scan.nextLine();

			switch (option.toLowerCase()) {
			case "r":
				System.out.println("enter string name-> ");
				name = scan.nextLine();
				System.out.println("enter content string-> ");
				content = scan.nextLine();
				System.out.println(ope.Readstring(name, content)); // Read String input
				break;

			case "w":
				System.out.println("enter string name-> ");
				name = scan.nextLine();
				System.out.println(ope.writeString(name)); // Write String output
				break;

			case "c":
				System.out.println("enter string name-> ");
				name = scan.nextLine();
				System.out.println(ope.clear(name)); // clear the String-linkedlist
				break;

			case "l":
				System.out.println("enter string name-> ");
				name = scan.nextLine();
				System.out.println(ope.len(name)); // return length of String-LinkedList
				break;

			case "e":
				System.out.println("enter string name 1-> ");
				name = scan.nextLine();
				System.out.println("enter string name 2-> ");
				content = scan.nextLine();
				System.out.println(ope.equals(name, content)); // compare String-LinkedList
				break;

			case "q":
				System.exit(0); // exit app
				break;

			default:
				System.out.println("Incorrect input");
				break;
			}
		}

	}

}
