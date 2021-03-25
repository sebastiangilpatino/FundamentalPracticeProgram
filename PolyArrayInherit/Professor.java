package PolyArrayInherit;

public class Professor extends DeptEmployee {

	private int numberOfPublications;

	public Professor(String name, double salary, int month, int day, int year, int publications) {
		super(name, salary, month, day, year);
		this.numberOfPublications = publications;
	}

	public int getNumberOfPublication() {
		return numberOfPublications;
	}

	public void setNumberOfPublication(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

	@Override
	public String toString() {
		return super.toString() + " Number of pubs: " + numberOfPublications;
	}
}
