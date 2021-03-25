package School;

public class Secretary extends DeptEmployee {

	private double overtimeHours;

	public Secretary(String name, double salary, int month, int day, int year, double overtimeHours) {
		super(name, salary, month, day, year);
		this.overtimeHours = overtimeHours;
	}

	public double getOverTimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	public double computeSalary() {
		return super.computeSalary() + 12 * overtimeHours;
	}

	@Override
	public String toString() {
		return super.toString() + " Number of Over time hours: " + overtimeHours;
	}
}
