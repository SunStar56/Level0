import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What mood are you in?", "Pop-up Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "I'm happy", "I'm Sad", "I'm Stressed" }, null);

		// 2. Their answer is stored in the userMood variable. Print it out.
		if (userMood == 1) {
			playVideo("https://www.youtube.com/watch?v=Oo-_iJNoggs&list=PLfY5sAzWL5inHuWu0_SKobiCdzZ2Be4B4&index=2");
		}
		System.out.println(userMood);

	} // 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.

	// 4. Play different songs for other moods.

	// If you are seeing ads at the beginning of your videos, install Adblock.

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
