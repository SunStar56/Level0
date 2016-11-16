import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class ChristmasTree {

	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		ChristmasTree ohChristmasTree = new ChristmasTree();
		ohChristmasTree.drawStar();
		ohChristmasTree.drawTreeBody();
		ohChristmasTree.drawTreeTrunk();
	}

	double treeWidth = 15;
	double scale = 1.1;
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
	}

	void drawStar() {
	}
}
