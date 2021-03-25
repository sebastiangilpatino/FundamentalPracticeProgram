package BankEx;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("Sebastian", "sebas", 50000, 1994, 3, 14);
		System.out.println("The employee was hired on: " + employee.getHireDay() + "\n");
		// SAVING ACCOUNTS
		Account savAcc = new Account(employee, AccountType.SAVINGS, 300);
		System.out.println("The balance is: " + savAcc.getBalance());
		savAcc.makeDeposit(100);
		System.out.println("The withdrawal is: " + savAcc.makeWithdrawal(12));
		System.out.println("The account type is: " + savAcc.getAcctType());
		System.out.println("The Interest is: " + savAcc.computeInterest() + "%");
		System.out.println("The details of the account: " + savAcc.toString() + "\n");
		// CHECKING ACCOUNTS
		Account cheAcc = new Account(employee, AccountType.CHECKING, 300);
		cheAcc.makeDeposit(180);
		System.out.println("The balance is: " + cheAcc.getBalance());
		System.out.println("The withdrawal is: " + cheAcc.makeWithdrawal(88));
		System.out.println("The account type is: " + cheAcc.getAcctType());
		System.out.println("The Interest is: " + cheAcc.computeInterest() + "%");
		System.out.println("The details of the account: " + cheAcc.toString() + "\n");
		// RETIREMENT ACCOUNTS
		Account retAcc = new Account(employee, AccountType.RETIREMENT, 300);
		retAcc.makeDeposit(55);
		System.out.println("The balance is: " + retAcc.getBalance());
		System.out.println("The withdrawal is: " + retAcc.makeWithdrawal(-12));// its not done cause can't be negative
																				// withdrawal
		System.out.println("The account type is: " + retAcc.getAcctType());
		System.out.println("The Interest is: " + retAcc.computeInterest() + "%");
		System.out.println("The details of the account: " + retAcc.toString() + "\n");
	}

}
