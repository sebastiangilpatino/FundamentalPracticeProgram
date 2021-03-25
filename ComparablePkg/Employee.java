package ComparablePkg;

public class Employee implements Comparable {
	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object arg0) {
		Integer ageTemp = this.age;
		Integer age1 = ((Employee) arg0).getAge();

		return ageTemp.compareTo(age1);
	}
}