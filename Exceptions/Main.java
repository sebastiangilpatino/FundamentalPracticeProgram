package Exceptions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// AgeInputVerification age = new AgeInputVerification();
		// System.out.println(age.getAge("Input ur Age"));

		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(2);
		List<Integer> arrLinked = new LinkedList<Integer>(arrList);
		arrLinked.add(1, 3);
		arrLinked.set(0, 4);
		System.out.println(arrLinked.get(2));

		System.out.println(arrLinked.toString());

	}

}
