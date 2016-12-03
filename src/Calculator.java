import javax.swing.JOptionPane;

public class Calculator {
	public static void main(String[] args) {
	    
		String ans1=JOptionPane.showInputDialog("Enter a number");
		String ans2=JOptionPane.showInputDialog("Enter a second number");
	
		int num1= Integer.parseInt(ans1);
		int num2= Integer.parseInt(ans2);
	
		int answer = add (num1,num2);

		System.out.println(answer);
	
	}
		static int add(int x, int y){
			return x+y;
		}
}