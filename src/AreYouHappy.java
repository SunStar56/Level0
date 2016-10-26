import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] cheese) {
		speak("Are you happy?");
		String ayh = JOptionPane.showInputDialog("Are you?");
		if (ayh.equalsIgnoreCase("Yes")) {
			speak("Keep doing whatever you're doing.  Do you want to be happier?");
			String happier = JOptionPane.showInputDialog("Answer the question. ;)");
			if (happier.equalsIgnoreCase("Yes")) {
				speak("Try to make others happy!");
				JOptionPane.showMessageDialog(null, ":D");
			} else if (happier.equalsIgnoreCase("No")) {
				speak("Okay then, keep doing what you do best...");
				JOptionPane.showMessageDialog(null, "Heheheheh... MUAHAHAHHAHHAHHAHAHAHHH 030");
			}
		} else if (ayh.equalsIgnoreCase("No")) {
			speak("Do you want to be happy?");
			String dybh = JOptionPane.showInputDialog("Well... Do you? :/");
			if (dybh.equalsIgnoreCase("No")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing, then... :(");
			}
			if (dybh.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null, "Change something. :)");
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"Did you misspell something?  Try answering with either 'yes' or 'no'.  Otherwise, I think you don't want to answer... -3-");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
