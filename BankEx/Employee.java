package BankEx;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee {

	// instance fields
	private String name;
	private String nickName;
	private double salary;
	private GregorianCalendar hireDay;

	// constructor
	Employee(String aName, String aNickName, double aSalary, int aYear, int aMonth, int aDay)

	{
		name = aName;
		nickName = aNickName;
		salary = aSalary;

		hireDay = new GregorianCalendar(aYear, aMonth - 1, aDay);
	}

	// instance methods
	public String getName() {
		return name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String aNickName) {
		nickName = aNickName;
	}

	public double getSalary() {
		return salary;
	}

	public String getHireDay() {
		return String.valueOf(
				hireDay.get(Calendar.MONTH) + 1 + "/" + hireDay.get(Calendar.DATE) + "/" + hireDay.get(Calendar.YEAR));
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public double yearlyFederalTax() {
		/*
		 * If the salary is greater than $80,000 then the tax is 28% of the salary. If
		 * the salary is greater than $50,000 and <= $80,000 then the tax is 24% of the
		 * salary. If the salary is greater than $26,000 and <= $50,000 then the tax is
		 * 20% of the salary. If the salary is <= $26,000 then there is no tax.
		 * 
		 */
		if (this.salary > 80000) {
			return this.salary * 0.28;
		} else if (this.salary > 50000 && this.salary <= 80000) {
			return this.salary * 0.24;
		} else if (this.salary > 26000 && this.salary <= 50000) {
			return this.salary * 0.20;
		} else {
			return this.salary * 0;
		}
	}

}
