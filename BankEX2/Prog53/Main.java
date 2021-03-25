package Prog53;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	List<Employee> emps = new ArrayList<Employee>();

	public static void main(String[] args) {
		new Main();
	}

	Main() {

		emps.add(new Employee("Jim Daley", 2000, 9, 4));
		emps.add(new Employee("Bob Reuben", 1998, 1, 5));
		emps.add(new Employee("Susan Randolph", 1997, 2, 13));

		emps.get(0).createNewChecking(10500);
		emps.get(0).createNewSavings(1000);
		emps.get(0).createNewRetirement(9300);

		emps.get(1).createNewChecking(34000);
		emps.get(1).createNewSavings(27000);

		emps.get(2).createNewChecking(10038);
		emps.get(2).createNewSavings(12600);
		emps.get(2).createNewRetirement(9000);

		Scanner sc = new Scanner(System.in);
		System.out.println("A. See a report of all account balances?");
		System.out.println("B. Make a deposit");
		System.out.println("C. Make a withdrawal");
		System.out.println("D. totalOfAllBalances");
		System.out.print("Make a selection (A/B/C/D): ");
		String answer = sc.nextLine();
		System.out.println("");

		switch (answer.toLowerCase()) {
		case "a":
			System.out.println(getFormattedAccountInfo());
			break;

		case "b":
			options(emps, sc, "deposit");
			break;

		case "c":
			options(emps, sc, "withdrawal");
			break;

		case "d":
			System.out.println(totalOfAllBalances());
			break;

		default:
			System.out.println("Wrong selection");
			break;
		}

	}

	String getFormattedAccountInfo() {
		String goodFormat = "";
		for (int i = 0; i < emps.size(); i++) {
			goodFormat += "ACCOUNT INFO FOR " + emps.get(i).getName() + ":\n\n";
			goodFormat += emps.get(i).getFormattedAcctInfo() + "\n\n";
		}

		return goodFormat;

	}

	double totalOfAllBalances() {
		double total = 0;
		for (int i = 0; i < emps.size(); i++) {
			for (int j = 0; j < emps.get(i).getNumberOfAccounts(); j++) {
				total += emps.get(i).getBalanceOfAccount(j);
			}

		}
		return total;
	}

	void options(List<Employee> emps, Scanner sc, String opt) {

		for (int i = 0; i < emps.size(); i++) {
			System.out.println(i + ". " + emps.get(i).getName());
		}

		System.out.print("Select an employee: (type a number) ");

		try {

			int numberEmployee = Integer.parseInt(sc.nextLine());

			System.out.println("");
			for (int i = 0; i < emps.get(numberEmployee).getNumberOfAccounts(); i++) {
				System.out.println(i + ". " + emps.get(numberEmployee).getAccount(i));
			}

			System.out.print("Select an account: (type a number) \n");
			int numberAcc = Integer.parseInt(sc.nextLine());

			if (numberAcc < 0 || numberAcc > emps.get(numberEmployee).getNumberOfAccounts()) {
				System.out.println("Wrong Selection");
				System.exit(0);
			}

			if (opt.equals("deposit") == true) {

				System.out.print("Deposit amount: ");
				int amount = Integer.parseInt(sc.nextLine());

				emps.get(numberEmployee).deposit(emps.get(numberEmployee).getAccount(numberAcc), amount);

				System.out
						.println(amount + " has been deposited in the " + emps.get(numberEmployee).getAccount(numberAcc)
								+ " account of " + emps.get(numberEmployee).getName());

			} else if (opt.equals("withdrawal") == true) {
				System.out.print("Withdrawal amount: ");
				int amount = Integer.parseInt(sc.nextLine());

				boolean wDraw = emps.get(numberEmployee).withdraw(emps.get(numberEmployee).getAccount(numberAcc),
						amount);

				if (wDraw == true) {
					System.out.println(
							amount + " has been withdraw in the " + emps.get(numberEmployee).getAccount(numberAcc)
									+ " account of " + emps.get(numberEmployee).getName());
				}

			}
		} catch (Exception e) {
			System.out.println("Wrong selection");
			System.exit(0);
		}

	}

}