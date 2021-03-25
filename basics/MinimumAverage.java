import java.util.Arrays;

public class MinimumAverage {

	public static void main(String[] args) {
		int[] numbers = { 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22 };
		System.out.println(Arrays.toString(numbers));
		System.out.println("The minimum number is:  " + min(numbers));
		System.out.println("The average is:  " + average(numbers));
	}

	public static int min(int[] arrayOfInts) {
		int minimum = arrayOfInts[0]; // set by default the first value the minimum
		for (int i = 0; i < arrayOfInts.length; i++) {
			if (arrayOfInts[i] < minimum) { // validate if exist other less than...
				minimum = arrayOfInts[i];
			}
		}
		return minimum;
	}

	public static int average(int[] arrayOfInts) {
		int sum = 0;
		for (int i = 0; i < arrayOfInts.length; i++) {
			sum += arrayOfInts[i];
		}
		return sum / arrayOfInts.length; // divide the sum by the number of items.
	}
}
