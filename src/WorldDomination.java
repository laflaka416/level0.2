import javax.swing.JOptionPane;

public class WorldDomination {
public static void main(String[] args) {
	
	
	
	for(int i = 0; i <= 3; i = i + 1){
		
		String answer = JOptionPane.showInputDialog(null, "Do you know how to code");
		
	if(answer.equals("yes")){
      JOptionPane.showMessageDialog(null, "you will rule the world!");
	}
	else{
		JOptionPane.showMessageDialog(null, "go learn!");
	}
}
}
}