import javax.swing.JOptionPane;

public class MyAges {
	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog(null, "Hello dear. How old are you?");

		int myAge = Integer.parseInt(answer);
		for (int myAges = 0; myAges <= myAge; myAges++) {

			if (myAges == 1) {
				JOptionPane.showMessageDialog(null, "you have been 1 year old");
			} else if (myAges == myAge) {
				JOptionPane.showMessageDialog(null, "you are " + myAge + " years old");
			} else {
				JOptionPane.showMessageDialog(null, "you have been " + myAges + " years old");
			}
		}

	}
}