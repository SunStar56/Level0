import javax.swing.JOptionPane;

public class HighLowGameReversed {
	public static void main(String[] args) {
		int highguess = 100;
		int lowguess = 1;
		String answer = JOptionPane.showInputDialog("Choose a number for the computer to guess.  Make sure to use whole numbers 1-100?");
		for (int i = 0; i < 100; i++) {
			int guess = (highguess + lowguess) / 2;
			String aiguess = JOptionPane.showInputDialog("I got " + guess + ". Is that higher, lower, or correct?");
			if (aiguess.equalsIgnoreCase("Higher")) {
				lowguess = guess;
			} else if (aiguess.equalsIgnoreCase("Lower")) {
				highguess = guess;
			} else if (aiguess.equalsIgnoreCase("Correct")) {
				JOptionPane.showMessageDialog(null, "Yay, I won! :D");
			}
		}
	}

}
