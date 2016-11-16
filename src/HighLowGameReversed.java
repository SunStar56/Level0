import javax.swing.JOptionPane;

public class HighLowGameReversed {
	public static void main(String[] args) {
		int highguess = 100;
		int lowguess = 1;
		String Answer = JOptionPane.showInputDialog("Choose a number for the computer to guess.  Make sure to use whole numbers 1-100?");
		for (int i = 0; i < 100; i++) {
			int guess = (highguess + lowguess) / 2;
			String AIGuess = JOptionPane.showInputDialog("I got " + guess + ". Is that higher, lower, or correct?");
			if (AIGuess.equalsIgnoreCase("Higher")) {
				lowguess = guess;
			} else if (AIGuess.equalsIgnoreCase("Lower")) {
				highguess = guess;
			} else if (AIGuess.equalsIgnoreCase("Correct")) {
				JOptionPane.showMessageDialog(null, "Yay, I won! :D");
			}
		}
	}

}
