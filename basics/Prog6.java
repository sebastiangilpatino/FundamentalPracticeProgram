import java.util.Arrays;

public class Prog6 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(removeDuplicates(args)));
	}

	public static String[] removeDuplicates(String[] arr) {
		if (arr.length > 1) {

			int cont = 0;

			String[] arrCopy = new String[arr.length];
			arrCopy[0] = arr[0];

			for (int i = 0; i < arr.length; i++) {

				for (int j = 0; j < arrCopy.length; j++) {
					if (arr[i].equals(arrCopy[j]) == true) {
						cont++;
					}
				}

				if (cont == 0) {
					arrCopy[i] = arr[i];
				} else {
					cont = 0;
				}

			}

			int size = 0;

			for (int i = 0; i < arrCopy.length; i++) {
				if (arrCopy[i] != null) {
					size++;
				}
			}

			String[] retStrings = new String[size];
			int index = 0;

			for (int i = 0; i < arrCopy.length; i++) {
				if (arrCopy[i] != null) {
					retStrings[index] = arrCopy[i];
					index++;
				}
			}

			return retStrings;
		} else {
			return arr;
		}
	}

}
