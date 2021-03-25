package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Draw extends JFrame implements ActionListener {

	private static final int FRAME_WIDTH = 600; // Default frame width

	private static final int FRAME_HEIGHT = 400; // Default frame height

	private static final int FRAME_X_ORIGIN = 150; // X coordinate of the frame default origin point

	private static final int FRAME_Y_ORIGIN = 250; // Y coordinate of the frame default origin point

	private static final int BUTTON_WIDTH = 120; // Default width for buttons

	private static final int BUTTON_HEIGHT = 30; // Default height for buttons

	private JButton cancelButton; // The Swing button for Cancel

	private JButton okButton; // The Swing button for OK

	// The JTextField for the user to enter a text
	private JTextField inputLine1, inputLine2, inputLine3, inputLine4, inputLine5;

	private JLabel label1, label2, label3, label4, label5;

	public Draw() {
		Container contentPane = getContentPane();

		// set the frame properties
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(true);
		setTitle("Program Ch7JButtonFrameHandler");
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

		// set the content pane properties
		contentPane.setLayout(null);
		contentPane.setBackground(Color.white);

		// create and place two buttons on the frame's content pane
		okButton = new JButton("Submit");
		okButton.setBounds(70, 150, BUTTON_WIDTH, BUTTON_HEIGHT);
		contentPane.add(okButton);

		// register this frame as an action listener of the button
		okButton.addActionListener(this);

		// #1 TextField
		inputLine1 = new JTextField();
		inputLine1.setBounds(90, 50, 130, 25);
		contentPane.add(inputLine1);

		// #2 TextField
		inputLine2 = new JTextField();
		inputLine2.setBounds(230, 50, 130, 25);
		contentPane.add(inputLine2);

		// #3 TextField
		inputLine3 = new JTextField();
		inputLine3.setBounds(370, 50, 130, 25);
		contentPane.add(inputLine3);

		// #4 TextField
		inputLine4 = new JTextField();
		inputLine4.setBounds(90, 100, 130, 25);
		contentPane.add(inputLine4);

		// #5 TextField
		inputLine5 = new JTextField();
		inputLine5.setBounds(230, 100, 130, 25);
		contentPane.add(inputLine5);

		inputLine1.addActionListener(this);
		inputLine2.addActionListener(this);
		inputLine3.addActionListener(this);
		inputLine4.addActionListener(this);
		inputLine5.addActionListener(this);

		label1 = new JLabel("Name");
		label1.setBounds(90, 20, 150, 25);
		contentPane.add(label1);

		label2 = new JLabel("Street");
		label2.setBounds(230, 20, 150, 25);
		contentPane.add(label2);

		label3 = new JLabel("City");
		label3.setBounds(370, 20, 150, 25);
		contentPane.add(label3);

		label4 = new JLabel("State");
		label4.setBounds(90, 80, 150, 25);
		contentPane.add(label4);

		label5 = new JLabel("Zip");
		label5.setBounds(230, 80, 150, 25);
		contentPane.add(label5);

		// register 'Exit upon closing' as a default close operation
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		Draw frame = new Draw();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton clickedButton = (JButton) e.getSource();

		// String buttonText = clickedButton.getText();

		// this.setTitle("You clicked " + buttonText);
		System.out.println(inputLine1.getText() + "\n" + inputLine2.getText() + "\n" + inputLine3.getText() + ", "
				+ inputLine4.getText() + " " + inputLine5.getText());

	}

}
