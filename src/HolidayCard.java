import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JApplet;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class HolidayCard extends MouseAdapter {

	double treeWidth = 15;
	double scale = 1.1; // This is how much the width of the tree grows with each layer

	/* 1. Paste your methods from the Christmas Tree Recipe here. */
	Color forestGreen = new Color(0, 62, 34);
	Color brown = new Color(102, 51, 0);

	void drawTreeBody() {
		Tortoise.setPenColor(forestGreen);
		int turnAmount = 175;
		Tortoise.turn(90);
		for (int i = 0; i < 11; i++) {
			Tortoise.move(treeWidth);
			Tortoise.turn(turnAmount);
			treeWidth = treeWidth * scale;
			Tortoise.move(treeWidth);
			Tortoise.turn(-turnAmount);
			treeWidth = treeWidth * scale;
			turnAmount = turnAmount - 1;
		}
	}

	void drawTreeTrunk() {
		Tortoise.move(treeWidth / 2);
		Tortoise.turn(90);
		Tortoise.setPenWidth(treeWidth / 10);
		Tortoise.setPenColor(brown);
		Tortoise.move(treeWidth / 4);
		Tortoise.setAngle(0);
	}

	/* 2. When the mouse is clicked draw a tree at that position. */
	public void mouseClicked(MouseEvent mouseEvent) {

		int mouseX = mouseEvent.getX();
		int mouseY = mouseEvent.getY();
		// Set the X position of the Tortoise to the X position of the mouse
		Tortoise.setX(mouseX);
		Tortoise.setY(mouseY);

		drawTree();
	}

	/* 3. Personalize your card. */
	void drawGreetingAndSing() {
		playmusic(music.wav);
		writeGreeting("Merry Christmas!");

	}

	private void writeGreeting(String greeting) {
		tortoiseWindow.getGraphics().drawString(greeting, 250, 50);
	}

	private void playMusic(String nameOfSoundFile) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(nameOfSoundFile));
		sound.play();
	}

	void drawTree() {
		// drawStar();
		drawTreeBody();
		drawTreeTrunk();
		treeWidth = 15;
		Tortoise.setAngle(0);
		Tortoise.setPenWidth(treeWidth / 5);
	}

	public static void main(String[] args) {
		new HolidayCard();
	}

	TurtlePanel tortoiseWindow;

	HolidayCard() {
		tortoiseWindow = Tortoise.getBackgroundWindow();
		tortoiseWindow.addMouseListener(this);
		Tortoise.show();
		Tortoise.setSpeed(10);
		drawGreetingAndSing();
	}
}
