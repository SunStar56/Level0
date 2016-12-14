import java.util.Scanner;

public class ChooseYourAdventure {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.println(
				"You are standing east of an abandoned house, with forest on all sides.  Where should you go?");
		while (true) {
			String line = scanner.nextLine();
			System.out.println(line);
			if (line.equalsIgnoreCase("east")) {
				System.out.println(
						"You are standing in front of the brown house.  You see a faint light coming from inside the house.");
				x = 1;
			}
			if (line.equalsIgnoreCase("open door")) {
				y = 1;
			}
			CYAMethods.getDescription(x, y);
		}

	}
}
