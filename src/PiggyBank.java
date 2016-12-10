import javax.swing.JOptionPane;

public class PiggyBank {
public static void main(String[] args) {
    String Quarters = JOptionPane.showInputDialog(null, "How many quarters do you have?");
    String Dimes = JOptionPane.showInputDialog(null, "dimes");
    String Nickels = JOptionPane.showInputDialog(null, "nickels");
    String Pennies = JOptionPane.showInputDialog(null, "pennies");
    int numQuarters = Integer.parseInt(Quarters);
    int numDimes = Integer.parseInt(Dimes);
    int numNickels= Integer.parseInt(Nickels);
    int numPennies = Integer.parseInt(Pennies);
    int valueNumQuarters = numQuarters*25;
   	int valueNumDimes = numDimes*10;
   	int valueNumNickels = numNickels*5;
   	int valueNumPennies = numPennies;
   	int answer = valueNumQuarters + valueNumDimes + valueNumNickels + valueNumPennies; 
    JOptionPane.showMessageDialog(null, "you have"+ answer + "cents");
}
}
