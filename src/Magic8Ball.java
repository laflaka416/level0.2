import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {

		// ask the user for a question
		String answer = JOptionPane.showInputDialog(null, "ask me a question, any question");
		// save the answer if you will like because you dont need it
		// create the program that sets things/numbers to random
		int num = new Random().nextInt(4);
		// if random number is 1 say "it depends"
		// if random # is 2 say "maybe"
		// if random number is 3 say "no"
		if (num == 1) {
			JOptionPane.showMessageDialog(null, "it depends");
		}	
		else if(num == 2){
			JOptionPane.showMessageDialog(null, "maybe");
		}
		else{
			JOptionPane.showMessageDialog(null, "No");
		}
		
	}
}
