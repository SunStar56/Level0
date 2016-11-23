import javax.swing.JOptionPane;

public class FingerCounter {
	public static void main(String[] args) {
		String opening = JOptionPane.showInputDialog("Standard or Advanced?");
		if (opening.equals("Standard")) {

			addition();
		} else {
			String factorone = JOptionPane.showInputDialog("What is the first number I should multiply?");
			String factortwo = JOptionPane.showInputDialog("What is the second number I should multiply?");
			String addition = JOptionPane
					.showInputDialog("What number would you like to add to the product of the first two numbers?");

			int fone = Integer.parseInt(factorone);
			int ftwo = Integer.parseInt(factortwo);
			int add = Integer.parseInt(addition);
			int fonesyso = 0;
			int repeatnum = 1;

			System.out.println("Okay, let's start by multiplying " + fone + " and " + ftwo + ".");

			for (int i = 0; i < ftwo; i++) {

				for (int j = 0; j < fone; j++) {
					System.out.println(fonesyso + " plus one is " + (fonesyso + 1));
					fonesyso = fonesyso + 1;
				}
				System.out.println("That is " + repeatnum + " time(s).");
				repeatnum = repeatnum + 1;

			}
			System.out.println("Now that we have the multiplication done, time to add.");
			int addsyso = fonesyso;
			for (int i = 0; i < add; i++) {
				System.out.println(addsyso + " plus one is " + (addsyso + 1));
				addsyso = addsyso + 1;
			}
			System.out.println(fone + " X " + ftwo + " + " + add + " = " + (addsyso));

		}
	}

	private static void addition() {
		String begnum = JOptionPane.showInputDialog("Please choose the starting number for me to add from.");
		String endnum = JOptionPane.showInputDialog("Please choose the ending number for me to count to.");
		int begint = Integer.parseInt(begnum);
		int endint = Integer.parseInt(endnum);
		int numrepeat = endint;
		int begintoriginal = begint;

		System.out.println("Alright, so we start with " + begintoriginal + ".");

		for (int i = 0; i < numrepeat; i++) {
			int begintplusone = begint + 1;
			System.out.println(begint + " plus one is " + begintplusone);
			begint = begint + 1;
		}
		int solution = endint + begintoriginal;
		System.out.println(begintoriginal + " plus " + endint + " is " + solution + ".");
	}
}
