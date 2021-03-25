package School;

public class Administrator extends DeptEmployee {

	int numberOfHoursWorked;

	public Administrator(String name, double salary, int month, int day, int year, int numberOfHoursWorked) {
		super(name, numberOfHoursWorked * 20, month, day, year);
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	@Override
	public String toString() {
		return super.toString() + " Number Of Hours Worked: " + numberOfHoursWorked;
	}

	@Override
	public double computeSalary() {
		return 20 * numberOfHoursWorked;
	}

}
