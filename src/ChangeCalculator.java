import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class ChangeCalculator {
	public static void main(String[] args) {
		String Quarters = JOptionPane.showInputDialog("How many quarters?");
		int numberquarters = Integer.parseInt(Quarters);
		int numberquartersfinal = numberquarters * 25;

		String Dimes = JOptionPane.showInputDialog("How many dimes?");
		int numberdimes = Integer.parseInt(Dimes);
		int numberdimesfinal = numberdimes * 10;

		String Nickels = JOptionPane.showInputDialog("How many nickels?");
		int numbernickels = Integer.parseInt(Nickels);
		int numbernickelsfinal = numbernickels * 05;
		double totalb = numbernickelsfinal + numberdimesfinal + numberquartersfinal;
		totalb /= 100.0;
		NumberFormat nf = NumberFormat.getCurrencyInstance();

		JOptionPane.showMessageDialog(null, "Your total change is " + nf.format(totalb) + ".");
	}
}
