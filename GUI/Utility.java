package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Utility extends JFrame implements ActionListener {

	private static final int FRAME_WIDTH = 600; // Default frame width

	private static final int FRAME_HEIGHT = 400; // Default frame height

	private static final int FRAME_X_ORIGIN = 150; // X coordinate of the frame default origin point

	private static final int FRAME_Y_ORIGIN = 250; // Y coordinate of the frame default origin point

	private static final int BUTTON_WIDTH = 180; // Default width for buttons

	private static final int BUTTON_HEIGHT = 30; // Default height for buttons

	private JButton buttonCount, buttonReverse, ButtonDuplicates; // The Swing button for Cancel

	// The JTextField for the user to enter a text
	private JTextField input, output;

	private JLabel label1, label2;

	public Utility() {
		Container contentPane = getContentPane();

		// set the frame properties
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(true);
		setTitle("Program Ch7JButtonFrameHandler");
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

		// set the content pane properties
		contentPane.setLayout(null);
		contentPane.setBackground(Color.white);

		// create and place buttons on the frame's content pane
		buttonCount = new JButton("Count Letters");
		buttonCount.setBounds(50, 50, BUTTON_WIDTH, BUTTON_HEIGHT);
		contentPane.add(buttonCount);
		// register this frame as an action listener of the button
		buttonCount.addActionListener(this);

		// create and place buttons on the frame's content pane
		buttonReverse = new JButton("Reverse Letters");
		buttonReverse.setBounds(50, 100, BUTTON_WIDTH, BUTTON_HEIGHT);
		contentPane.add(buttonReverse);
		// register this frame as an action listener of the button
		buttonReverse.addActionListener(this);

		// create and place buttons on the frame's content pane
		ButtonDuplicates = new JButton("Remove  Duplicates");
		ButtonDuplicates.setBounds(50, 150, BUTTON_WIDTH, BUTTON_HEIGHT);
		contentPane.add(ButtonDuplicates);
		// register this frame as an action listener of the button
		ButtonDuplicates.addActionListener(this);

		// #1 TextField
		input = new JTextField();
		input.setBounds(260, 110, 130, 25);
		contentPane.add(input);

		// #2 TextField
		output = new JTextField();
		output.setBounds(260, 150, 130, 25);
		contentPane.add(output);

		input.addActionListener(this);
		output.addActionListener(this);

		label1 = new JLabel("Input");
		label1.setBounds(260, 90, 150, 25);
		contentPane.add(label1);

		label2 = new JLabel("Output");
		label2.setBounds(260, 130, 150, 25);
		contentPane.add(label2);

		// register 'Exit upon closing' as a default close operation
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		Utility frame = new Utility();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton clickedButton = (JButton) e.getSource();
		String buttonText = clickedButton.getText();

		if (buttonText.equals("Count Letters") == true) {
			output.setText(countLetter(input.getText()));
		} else if (buttonText.equals("Reverse Letters") == true) {
			output.setText(reverseLetters(input.getText()));
		} else if (buttonText.equals("Remove  Duplicates") == true) {
			output.setText(removeDuplicates(input.getText()));
		}

	}

	public String countLetter(String letters) {
		return String.valueOf(letters.length());
	}

	public String reverseLetters(String letters) {
		String output = "";

		for (int i = letters.length() - 1; i >= 0; i--) {
			output += letters.substring(i, i + 1);
		}

		return output;

	}

	public String removeDuplicates(String letters) {
		String output = "";

		for (int i = 0; i < letters.length(); i++) {
			if (output.contains(letters.substring(i, i + 1)) == false) {
				output += letters.substring(i, i + 1);
			}
		}

		return output;

	}

}
