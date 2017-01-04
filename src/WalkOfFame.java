import java.util.Random;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class WalkOfFame {

	public static void main(String[] args) {
		Random num = new Random();
		int numint = num.nextInt(10);
		Tortoise.setSpeed(10);
		// 1. Set the X position of the Tortoise so that it starts on the left.
		// You also need to show the Tortoise to see the result of this line.
		Tortoise.setX(0);
		// 2. Make the Tortoise draw a star shape. Hint: 144.
		Tortoise.setPenColor(PenColors.Yellows.Gold);
		for (int j = 0; j < numint; j++) {
			for (int i = 0; i < 5; i++) {
				Tortoise.move(30);
				Tortoise.turn(144);
			}
			Tortoise.turn(0);
			Tortoise.penUp();
			int x = Tortoise.getX();
			Tortoise.setX(x + 50);
			x = Tortoise.getX();
			Tortoise.penDown();
		}

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
