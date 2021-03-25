package Prog53;

public class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, double balance) {
		this.employee = emp;
		this.balance = balance;
	}// constructor

	Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}// contructor

	public double getBalance() {
		return this.balance;
	}

	public AccountType getAcctType() {
		return this.acctType;
	}

	public String toString() {
		return "Account type: " + acctType + "\n";
	}

	public void makeDeposit(double deposit) {
		if (deposit > 0) {
			this.balance += deposit;
		} // Can't be negative deposit
	}

	public boolean makeWithdrawal(double amount) {
		if (amount > this.balance) {
			System.out.println("insufficient funds");
			return false;
		} else {
			this.balance -= amount;
			return true;
		}
	}

	public double computeInterest() {
		/*
		 * he method returns the yearly interest amount for that account. If the account
		 * is a checking account then the interest = balance * 0.02 If the account is a
		 * savings account then the interest = balance * 0.04 If the account is a
		 * retirement account then the interest = balance * 0.05
		 */
		if (acctType.equals(AccountType.CHECKING) == true) {
			return this.balance * 0.02;
		} else if (acctType.equals(AccountType.SAVINGS) == true) {
			return this.balance * 0.04;
		} else if (acctType.equals(AccountType.RETIREMENT) == true) {
			return this.balance * 0.05;
		}
		return 0;
	}
}
