package Exceptions;

import javax.swing.JOptionPane;

public class AgeInputVerification {

	/** Default prompt message */
	private static final String DEFAULT_MESSAGE = "Your age:";

	/**
	 * Default constructor
	 */
	public AgeInputVerification() {

	}

	/**
	 * Inputs the age from an input dialog with default prompt
	 */
	public int getAge() {

		return getAge(DEFAULT_MESSAGE); // Overloading
	}

	/**
	 * Inputs the age from an input dialog with the designated prompt
	 *
	 * @param prompt message to prompt the user
	 */

	public int getAge(String prompt) { // overloading

		String inputStr;
		int age = 0;

		while (true) {

			inputStr = JOptionPane.showInputDialog(null, prompt);

			try {
				age = Integer.parseInt(inputStr);
				assert age < 140 : "age forbidden: " + age; // the age must be <140
				assert age > 0 : "age forbidden: " + age; // the age must be >0
				return age; // We get out.
			}

			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "'" + inputStr + "' is invalid\n" + "Please enter digits only");

				// System.out.println(e.getMessage()); COMMENTED OUT!
				// e.printStackTrace();
			}

			finally {

				// this part is always executed whether there is
				// an exception or not
				// System.out.println("getAge is done");
			}
		}
	}

}
