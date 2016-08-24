import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		
for (int i = 0; i < 10; i++) {
	String Answer = JOptionPane.showInputDialog("Which animal would you like?");
	if (Answer.equals("Dog")) {
		 playWoof();
	}
	if (Answer.equals("Cow")) {
		playMoo();
	}
	if (Answer.equals("Duck")){
		playQuack();
	}
    if (Answer.equals("Llama")){
	playLlama();
}
	if (Answer.equals("Cat")){
	playMeow();
	}
}

	}
	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}
	void playLlama() {
		playNoise(llamaFile);
	}
	void playWoof() {
		playNoise(woofFile);
	}
	void playMeow() {
		playNoise(meowFile);
	}

	  String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


	/* Ignore this stuff */

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}


