package Prog53;

public class CheckingAccount extends Account {

	CheckingAccount(Employee emp, double balance) {
		super(emp, balance);
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}

	@Override
	public double getBalance() {
		super.makeWithdrawal(0.2);
		return super.getBalance();
	}

	@Override
	public String toString() {
		return "Account type: " + this.getAcctType() + "\n" + "Current bal: " + super.getBalance();
	}

}
