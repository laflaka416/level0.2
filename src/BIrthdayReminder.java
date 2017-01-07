import javax.swing.JOptionPane;

public class BIrthdayReminder {
	public static void main(String[] args) {
		String miCumple = "April 16th";
		String GerrysBDay = "February 20th";
		String davidsBDay = "October 27th";
		String answer = JOptionPane.showInputDialog("Whose birthday do you want to know?");
		if (answer.equals("Zaira")) {
			JOptionPane.showMessageDialog(null, "April 16");
		}
		if (answer.equals("Gerry")) {
			JOptionPane.showMessageDialog(null, "February 20");
		}
		if(answer.equals("David")){
			JOptionPane.showMessageDialog(null, "October 27");
		}
		else{
			JOptionPane.showMessageDialog(null, "Sorry, I Dont Know");
		}
	}
}
