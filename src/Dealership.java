import javax.swing.JOptionPane;

public class Dealership {
public static void main(String[] args) {
	//Customer || imput 4 diff. things
	JOptionPane.showMessageDialog(null, "Hello!  You are going to be ordering a car online.  Let's begin.");

	String Make = JOptionPane.showInputDialog("First, we need to find out what car you would like!  We currently have Honda, Ford, Chevrolet, and Toyota.  Which make would you like?");
	
	if (Make.equals ("Honda")) {
		String HondaModel = JOptionPane.showInputDialog("So, a Honda, eh?  Well, there are two different models - the Civic and the CR-V.  Which one would you like?");
	}
	else if (Make.equals ("Ford")) {
		String FordModel = JOptionPane.showInputDialog("So, a Ford, huh?  Well, we happen to have a Fusion in stock!  The only problem is that it only comes in blue, white, black, or red.  Which color do you like best?");
	}
	
	else if (Make.equals ("Chevrolet")) {
		String ChevyModel = JOptionPane.showInputDialog("So, a Chevrolet, right?  Well, we have a Colorado in stock!  It comes in white, black, or gray.  Which color would you like?");
	}else {
		JOptionPane.showMessageDialog(null, "We're sorry, but that is not available.  Please try again.");
	}
	//own list of cars
	//if then
	//print all back
}
}
