package PolyArrayInherit;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DeptEmployee {
	private String name;
	private double salary;
	private GregorianCalendar hireDate;

	public DeptEmployee(String name, double salary, int month, int day, int year) {
		this.hireDate = new GregorianCalendar(year, month, day);
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHireDate() {
		return String.valueOf(
				hireDate.get(Calendar.MONTH) + "/" + hireDate.get(Calendar.DATE) + "/" + hireDate.get(Calendar.YEAR));
	}

	public void setHireDate(int month, int day, int year) {
		this.hireDate = new GregorianCalendar(year, month - 1, day);

	}

	public double computeSalary() {
		return salary;
	}

	public String toString() {
		return "Name: " + name + "\n Salary: " + salary + "\n Hire Date: " + this.getHireDate();
	}

}
