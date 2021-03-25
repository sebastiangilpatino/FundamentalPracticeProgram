package BankEx;

public class Account {
	// public final static String CHECKING = "checking";
	// public final static String SAVINGS = "savings";
	// public final static String RETIREMENT = "retirement";

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		this.employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public double getBalance() {
		return this.balance;
	}

	public AccountType getAcctType() {
		return this.acctType;
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		if (deposit > 0) {
			this.balance += deposit;
		}
	}

	public boolean makeWithdrawal(double amount) {
		// updates the balance field and returns true, unless
		// withdrawal amount is too large; in that case,
		// it does not modify the balance field, and returns false
		if (amount > this.balance) {
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
