package Prog53;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Employee {
	private List<Account> accounts = new ArrayList<Account>();
	private String name;
	private Date hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		hireDate = cal.getTime();
	}

	public void createNewChecking(double startAmount) {
		accounts.add(new CheckingAccount(this, startAmount));

	}

	public void createNewSavings(double startAmount) {
		accounts.add(new SavingsAccount(this, startAmount));
	}

	public void createNewRetirement(double startAmount) {
		accounts.add(new RetirementAccount(this, startAmount));
	}

	public void deposit(AccountType acctType, double amt) {
		if (amt < 0) {
			System.out.println("deposit must be positive");
			System.exit(0);
		} else {

			for (int i = 0; i < accounts.size(); i++) {
				if (accounts.get(i).getAcctType() == AccountType.CHECKING) {
					accounts.get(i).makeDeposit(amt);
				} else if (accounts.get(i).getAcctType() == AccountType.RETIREMENT) {
					accounts.get(i).makeDeposit(amt);
				} else if (accounts.get(i).getAcctType() == AccountType.SAVINGS) {
					accounts.get(i).makeDeposit(amt);
				}
			}
		}

	}

	public boolean withdraw(AccountType acctType, double amt) {
		if (amt < 0) {
			System.out.println("withdraw must be positive");
			return false;
		} else {
			for (int i = 0; i < accounts.size(); i++) {
				if (accounts.get(i).getAcctType() == AccountType.CHECKING) {
					return accounts.get(i).makeWithdrawal(amt);
				} else if (accounts.get(i).getAcctType() == AccountType.RETIREMENT) {
					return accounts.get(i).makeWithdrawal(amt);
				} else if (accounts.get(i).getAcctType() == AccountType.SAVINGS) {
					return accounts.get(i).makeWithdrawal(amt);
				}
			}

		}
		return false;
	}

	public String getFormattedAcctInfo() {
		String output = "";
		for (int i = 0; i < accounts.size(); i++) {
			output += accounts.get(i).toString() + "\n";
		}

		return output;
		// organize the string if some account was not opened
	} // Q: what happen if open just one

	public AccountType getAccount(int index) {
		return accounts.get(index).getAcctType();
	}

	public String getName() {
		return name;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public int getNumberOfAccounts() {
		return accounts.size();
	}

	public double getBalanceOfAccount(int index) {
		return accounts.get(index).getBalance();
	}
}
