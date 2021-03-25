package School;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		DeptEmployee[] department = new DeptEmployee[6];

		department[0] = new Secretary("Maria", 80000, 05, 18, 1993, 200);
		department[1] = new Secretary("Dani", 65000, 05, 18, 1991, 200);
		department[2] = new Professor("Sebas", 25000, 03, 16, 1994, 10);
		department[3] = new Professor("Jorge", 22000, 02, 15, 1999, 10);
		department[4] = new Professor("Andy", 37000, 01, 13, 1990, 10);
		department[5] = new Administrator("Rafa", 0, 8, 14, 1777, 148); // Q: about salary

		System.out.print("Do you want to see the sum of all salaries? (Y/N): ");
		Scanner sc = new Scanner(System.in);
		String w = sc.nextLine();

		int sumSalaries = 0;
		if (w.equalsIgnoreCase("y") == true) {
			for (int i = 0; i < department.length; i++) {
				sumSalaries += department[i].computeSalary();
			}

			System.out.println("The sum of all salaries is: " + sumSalaries);
		}

		System.out.print("would like to search for the details of an employee (Y/N): ");
		w = sc.nextLine();
		int flag = -1;
		if (w.equalsIgnoreCase("y") == true) {
			System.out.print("Input the name: ");
			w = sc.nextLine();
			for (int i = 0; i < department.length; i++) {
				if (w.equals(department[i].getName()) == true) {
					flag = i;
				}
			}

			if (flag >= 0) {
				System.out.println(department[flag].toString());
			} else {
				System.out.println("Sorry, we cant find your employee");
			}
		} else {
			System.out.println("Good Bye");
		}

	}

}
