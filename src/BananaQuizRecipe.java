
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuizRecipe {
	{
	
}
	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String banana = JOptionPane.showInputDialog(null, "Do you like bananas?");
		// 2. if they say no,
		// tell them they are crazy
		// and end quiz
		if (banana.equals("no")) {
			JOptionPane.showMessageDialog(null, "you are crazy my dude");
		}
		// 3. if they say yes
		else if (banana.equals("yes")){
	String hobby = JOptionPane.showInputDialog(null,"what is your favorite hobby?");
	JOptionPane.showMessageDialog(null, hobby + "is much better with bananas!");
		}

		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"

		// 4. OPTIONAL: if they say something other than “yes” or “no”
		// show a pop up that says “You are bananas!”

	}

}
