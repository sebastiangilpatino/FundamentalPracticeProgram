package ComparatorPkg;

import java.util.Comparator;

//An Easier way to write a Comparator!

public class SsnComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.getSsn().compareTo(o2.getSsn());
	}

}