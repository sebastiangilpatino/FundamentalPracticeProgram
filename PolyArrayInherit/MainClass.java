package PolyArrayInherit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		List<DeptEmployee> department = new ArrayList<DeptEmployee>();

		department.add(new Secretary("Maria", 80000, 05, 18, 1993, 200));
		department.add(new Secretary("Dani", 65000, 05, 18, 1991, 200));
		department.add(new Professor("Sebas", 25000, 03, 16, 1994, 10));
		department.add(new Professor("Jorge", 22000, 02, 15, 1999, 10));
		department.add(new Professor("Andy", 37000, 01, 13, 1990, 10));
		department.add(new Administrator("Rafa", 0, 8, 14, 1777, 148));

		System.out.print("Do you want to see the sum of all salaries? (Y/N): ");
		Scanner sc = new Scanner(System.in);
		String w = sc.nextLine();

		int sumSalaries = 0;
		if (w.equalsIgnoreCase("y") == true) {
			for (int i = 0; i < department.size(); i++) {
				sumSalaries += department.get(i).computeSalary();
			}

			System.out.println("The sum of all salaries is: " + sumSalaries);
		} else {
			System.out.println("Good Bye");
			System.exit(0);
		}

		System.out.print("would like to search for the details of an employee (Y/N): ");
		w = sc.nextLine();
		int flag = -1;
		if (w.equalsIgnoreCase("y") == true) {

			for (int i = 0; i < department.size(); i++) {
				System.out.println(i + " : " + department.get(i).getName());
			}

			System.out.print("\nInput the name: ");

			w = sc.nextLine();
			for (int i = 0; i < department.size(); i++) {
				if (w.equalsIgnoreCase(department.get(i).getName()) == true) {
					flag = i;
				}
			}

			if (flag >= 0) {
				System.out.println(department.get(flag).toString());
			} else {
				System.out.println("Sorry, we cant find your employee");
			}
		} else {
			System.out.println("Good Bye");
		}

	}

}
