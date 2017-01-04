import javax.swing.JOptionPane;

public class Riddlesss {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String Q1 = JOptionPane.showInputDialog("What word in the dictionary is spelled incorrectly?");
		if (Q1.equalsIgnoreCase("Incorrectly")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		JOptionPane.showMessageDialog(null, "You now have " + score + " point(s)!");
		String Q2 = JOptionPane.showInputDialog(
				"If you have me, you want to share me.  If you share me,you haven't got me.  What am I?");
		if (Q2.equalsIgnoreCase("Secret")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		JOptionPane.showMessageDialog(null, "You now have " + score + " point(s)!");
		String Q3 = JOptionPane.showInputDialog("Take off my skin - I won't cry, but you will!  What am I?");
		if (Q3.equalsIgnoreCase("Onion")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		JOptionPane.showMessageDialog(null, "You now have " + score + " point(s)!");

	}
}
