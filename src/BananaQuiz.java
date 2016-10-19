import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("Do you like bananas?");
		if (answer.equals("yes")) {
			String hobby = JOptionPane.showInputDialog("Great, so do I!  What's your favorite hobby?");
			JOptionPane.showMessageDialog(null, hobby + " is much better than bananas!");
		} else if (answer.equals("no")) {
			JOptionPane.showMessageDialog(null, "You are crazy!");
		} else {
			JOptionPane.showMessageDialog(null, "You're bananas!  Next time, answer with either 'yes' or 'no'.");
		}

	}

}