import java.util.Random;
import java.util.Scanner;

public class ChooseYourAdventure {
	public static int housedooropen = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int e = 1;
		int random = new Random().nextInt(5);
		System.out.println("You are standing east of an abandoned house, with forest on all sides.  Where should you go?");
		while (true) {
			String line = scanner.nextLine();
			System.out.println(line);
			if (line.equalsIgnoreCase("west") || line.equalsIgnoreCase("go west")) {
				x = x - 1;
			} else if (line.equalsIgnoreCase("east") || line.equalsIgnoreCase("go east")) {
				x = x + 1;
			} else if (line.equalsIgnoreCase("north") || line.equalsIgnoreCase("go north")) {
				y = y + 1;
			} else if (line.equalsIgnoreCase("south") || line.equalsIgnoreCase("go south")) {
				y = y - 1;
			} else if (line.equalsIgnoreCase("open door") && x == 1 && y == 0) {
				housedooropen = 1;
				System.out.println("The door is now open.");
			} else if (line.equalsIgnoreCase("close door") && x == 1 && y == 0) {
				housedooropen = 0;
				System.out.println("The door is now closed.");
			} else if (line.equalsIgnoreCase("random")) {
				if (random == 1) {
					System.out.println("You have gone an hour heading east.");
					x = x + 1;
					random = new Random().nextInt(5);
				} else if (random == 2) {
					System.out.println("You have gone an hour heading north.");
					y = y + 1;
					random = new Random().nextInt(5);
				} else if (random == 3) {
					System.out.println("You have gone an hour heading south.");
					y = y - 1;
					random = new Random().nextInt(5);
				} else {
					System.out.println("You have spent an hour going west.");
					x = x - 1;
					random = new Random().nextInt(5);
				}
			}
			CYAMethods.getDescription(x, y, e);
			System.out.println(x + " , " + y + " , " + e);
		}

	}
}
