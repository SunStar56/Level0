

	 import java.util.Random;

import javax.swing.JOptionPane;

	// Copyright Wintriss Technical Schools 2013
	public class HighLowGame {

		public static void main(String[] args) {
			// 3. Change this line to give you a random number between 1 - 100. 
			int random = new Random().nextInt(101);  
			// 2. Print out the random variable above
			for (int i = 0; i < 10; i++) {
				String Guess = JOptionPane.showInputDialog("Try to guess the number I'm thinking of. Hint - The number is between zero and one hundred.");  //self-explanatory
				int IntGuess = Integer.parseInt(Guess);  //Changes the Guess String to Int
			//Makes a Random #
	
				int AnswerRight = 0;

				if (IntGuess==random) {
					JOptionPane.showInputDialog("Great job!  You guessed the number!");
				}else if (IntGuess>random){
					JOptionPane.showMessageDialog(null, "Try going a bit lower.");
			
				}else if (IntGuess<random){
				JOptionPane.showMessageDialog(null, "Try going a bit higher.");
			
			}
				}
					JOptionPane.showMessageDialog(null, "You did not guess the number, please try again.");
			// 11. do the following 10 times
			
				// 1. ask the user for a guess using a pop-up window, and save their response 

				// 4. convert the users’ answer to an int (Integer.parseInt(string))
				
				// 5. if the guess is correct
					// 6. win
				// 7. if the guess is high
					// 8. tell them it's too high
				// 9. if the guess is low
					// 10. tell them it's too low

			// 12. tell them they lose
		}

		}
