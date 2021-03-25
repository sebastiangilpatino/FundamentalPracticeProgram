package Prog53;

public class SavingsAccount extends Account {

	SavingsAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}

	@Override
	public double getBalance() {
		super.makeWithdrawal(0.1);
		return super.getBalance();
	}

	@Override
	public String toString() {
		return "Account type: " + this.getAcctType() + "\n" + "Current bal: " + super.getBalance();
	}

}
