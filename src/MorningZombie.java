import javax.swing.JOptionPane;

public class MorningZombie {
	static void dayPrint(String weekDay) {
		JOptionPane.showMessageDialog(null, " Its " + weekDay + "! Wake up!");
		JOptionPane.showMessageDialog(null, "ya despiertate es tarde, ponte la pinche ropa!");
		JOptionPane.showMessageDialog(null, "eat what mom made for you ");
	}

	public static void main(String[] args) {

		// JOptionPane.showMessageDialog(null, "Its Monday ! Wake up!");
		// JOptionPane.showMessageDialog(null, "ya despiertate es tarde, ponte la pinche ropa!");
		// JOptionPane.showMessageDialog(null, "");

		String answer = JOptionPane.showInputDialog("What day is it ?");

		if (answer.equals("Monday")||answer.equals("Tuesday")||answer.equals("Wednesday")||answer.equals("Thursday")||answer.equals("Friday")){
			
			dayPrint(answer);
		}
	}
}
