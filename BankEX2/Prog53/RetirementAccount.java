package Prog53;

public class RetirementAccount extends Account {

	RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}

	@Override
	public boolean makeWithdrawal(double amount) {

		if (amount > super.getBalance()) {
			System.out.println("insufficient funds");
			return false;
		} else {
			super.makeWithdrawal(1);
			super.makeWithdrawal(amount);
			return true;
		}
	}

	@Override
	public String toString() {
		return "Account type: " + this.getAcctType() + "\n" + "Current bal: " + super.getBalance();
	}

}
