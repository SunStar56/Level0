import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {

		String Cats = JOptionPane.showInputDialog("How many cats do you have? :3");
		int cat = Integer.parseInt(Cats);
		if (cat > 3) {
			JOptionPane.showMessageDialog(null, "You are a crazy cat lady.  No other words can describe you.");

		} else if (cat < 3 && cat > 0) {
			playVideo("https://www.youtube.com/watch?v=3EIbWjkimAs");
		} else {
			playVideo("https://www.youtube.com/watch?v=SKRgktzRvZ0");
		}

	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
