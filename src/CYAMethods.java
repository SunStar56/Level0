
public class CYAMethods {
	public static void getDescription(int x, int y, int e) {
		if (x == 1 && y == 0 && e == 1) {
			System.out.println(
					"You are standing in front of the abandoned house.  There is a faint light coming from inside.");
		}
		if (x == 1 && y == 1 && e == 1 && ChooseYourAdventure.housedooropen == 1) {
			e = 1;
			System.out.println(
					"You walk inside the house.  Immediately you see a flight of stairs to the north, and a walkway to the east and south.");
		}
		if (x == 1 && y == 1 && e == 1 && ChooseYourAdventure.housedooropen == 0) {
			System.out.println("The door is closed. You can't reach the handle from your position.");

		}
		if (x == 1 && y == 2 && e == 2) {
			System.out.println("You have gone upstairs, but it is extremely dark. You will be eaten by a grue.");
		}
		if (x == 1 && y == 2 && e == 1) {
			System.out.println("You are on the bottom stair.");
		}
		if (x == 2 && y == 1 && e == 1 && ChooseYourAdventure.lookedcat == 0) {
			System.out.println(
					"You have walked into a room with a cat sitting next to the boarded up window, staring into space.");
		}
		if (x == 2 && y == 1 && e == 1 && ChooseYourAdventure.lookedcat == 1) {
			System.out.println(
					"You moved the cat, finding it is made of clay.  A skilled potter must have made this.  You see that the cat was sitting on a key. ");
		}

	}

}
