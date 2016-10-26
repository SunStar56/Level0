import javax.swing.JOptionPane;

public class AirplaneNavigation {
	public static void main(String[] args) {

		// * Airline registration
		JOptionPane.showMessageDialog(null,
				"Hello, welcome to Eclipse Airways!  This program is designed to let you get the best experience on your flight.  Please complete the following questions.");
		// * You are writing a program for a new airline to take their
		// registration information at the check-in counter
		// * and print their boarding pass. You need to collect the following
		// information:

		for (int i = 1; i < 11; i++) {

			String fn = JOptionPane.showInputDialog("What is your FIRST name?");

			String ln = JOptionPane.showInputDialog("What is your LAST name?");

			String da = JOptionPane.showInputDialog("What airport are you flying to?");

			String bd = JOptionPane.showInputDialog("What is your birthday?  This is FOR SECURITY PURPOSES ONLY!");
			String gd = JOptionPane
					.showInputDialog("Male or female?  Please only answer M/F. This is FOR SECURITY PURPOSES ONLY!");

			JOptionPane.showMessageDialog(null, "Here is your ticket.");
			JOptionPane.showMessageDialog(null, ln + "||" + fn + "||" + da + "||" + bd + "(" + gd + ")");
			JOptionPane.showMessageDialog(null, "Total passengers - " + i + ".");
		}
	}
}