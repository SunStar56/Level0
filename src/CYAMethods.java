
public class CYAMethods {
	public static void getDescription(int x, int y) {
		if (x == 1 && y == 0) {
			System.out.println(
					"You are standing in front of the abandoned house.  There is a faint light coming from inside.");
		}
		if (x == 1 && y == 1 && ChooseYourAdventure.housedooropen == 1) {
			System.out.println(
					"You walk inside the house.  Immediately you see a flight of stairs to the north, and a walkway to the east and south.");
		}
		if (x == 1 && y == 1 && ChooseYourAdventure.housedooropen == 0) {
			System.out.println("The door is closed. You can't reach the handle from your position.");

		}
		if (x == 1 && y == 2) {
			System.out.println("You have gone upstairs, but it is extremely dark.");
		}
		if (x == 1) {

		}
	}

}
