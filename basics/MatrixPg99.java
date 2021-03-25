import java.util.Arrays;

public class MatrixPg99 {

	public static void main(String[] args) {
		double[][] investment = new double[3][6]; // create matrix
		double[] averageRow = new double[investment.length]; // array for average rows
		double[] averageCol = new double[investment[0].length]; // array for average columns

		for (int i = 0; i < investment[0].length; i++) {
			investment[0][i] = 10000;
		} // fill the first row

		double interest = 10; // the interest of each year

		for (int i = 1; i < investment.length; i++) { // row
			for (int j = 0; j < investment[i].length; j++) { // col
				investment[i][j] = investment[i - 1][j] + investment[i - 1][j] * (interest) / 100;
				interest++;
			}
			interest = 10; // initialize interest
		} // for nested loop to fullfill the matrix.

		int sum = 0;

		for (int i = 0; i < investment.length; i++) { // average of Row equals than the nested loops
			for (int j = 0; j < investment[i].length; j++) { // to fulfill the matrix
				sum += investment[i][j];
			}
			averageRow[i] = sum / investment[i].length; // it is divide by the number of columns items.
			sum = 0; // initialize sum
		}

		for (int i = 0; i < investment[0].length; i++) { // average of Col: change the nested lopps
			for (int j = 0; j < investment.length; j++) { // know is first col then row
				sum += investment[j][i]; // change j <-> i to pass trough columns.
			}
			averageCol[i] = sum / investment.length; // store the average it divides by the number of arrows
			sum = 0; // initialize sum
		}

		System.out.println("The matrix shows the growth of an investment at different interest rates: ");
		for (int i = 0; i < investment.length; i++) { // row
			for (int j = 0; j < investment[i].length; j++) { // col
				System.out.print(investment[i][j] + "  ");
			}
			System.out.println("");
		} // printing the matrix

		System.out.println("The Average of each row is: " + Arrays.toString(averageRow)); // print
		System.out.println("The Average of each col is: " + Arrays.toString(averageCol));

	}

}
