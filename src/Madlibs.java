import javax.swing.JOptionPane;

public class Madlibs {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested r		
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String adj = JOptionPane.showInputDialog(null, "Enter an adjective please");
		// Get the user to enter a type of liquid
		String liquid = JOptionPane.showInputDialog(null, "Enter your favorite liquid please");
		// Get the user to enter a body part
		String BodyPart = JOptionPane.showInputDialog(null, "enter a body part please");
		// Get the user to enter a verb
		String Verb = JOptionPane.showInputDialog(null, " Please enter a verb");
		// Get the user to enter a place
		String Setting = JOptionPane.showInputDialog(null,"enter your favorite place");
		// Fit the user's words into this sentence, and save it in a String:
		JOptionPane.showMessageDialog(null,"Piranhas are more " + adj + " during the day, so cross the river at night. Piranhas are "
+ " attracted to fresh " + liquid + " and will most " + " likely take a bite out of your " + BodyPart + " if you " + Verb + " Whatever you do, if you have an open wound, try to find another way to get back to the " + Setting + " ,Good luck!");
				
				
				
				
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		//likely take a bite out of your [body part] if you [verb]. Whatever
	    //you do, if you have an open wound, try to find another way to get
		//back to the [place]. Good luck!

		// Make a pop-up for the final story. You can use \n to go to the next line.

	}
}
