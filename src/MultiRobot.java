import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class MultiRobot {
	public static void main(String[] args) {

		// Robot rob = new Robot();
		// rob.penDown();
		// rob.setPenColor(Color.blue);
		// rob.move(200);
		// Robot sue = new Robot();
		// sue.penDown();
		// sue.turn(45);
		// sue.move(200);
		// Robot mary = new Robot();
		// mary.setPenColor(Color.green);
		// mary.turn(90);
		// mary.move(200);
		String ans = JOptionPane.showInputDialog(" what color do you want?");
		String ans2 = JOptionPane.showInputDialog(" how long a line do you want?");
		int num = Integer.parseInt(ans2);
		Robot rob = new Robot();
		rob.penDown();
		Color color = Color.BLUE;
		if (ans.equals("yellow")) {
			color = Color.YELLOW;
		}
		if (ans.equals("blue")) {
			color = Color.BLUE;
		}
		if (ans.equals("green")) {
			color = Color.GREEN;
		}
		if (ans.equals("black")) {
			color = Color.BLACK;
		}
		if (ans.equals("pink")) {
			color = Color.PINK;
		}
		if (ans.equals("red")) {
			color = Color.RED;
		}
		if (ans.equals("orange")) {
			color = Color.ORANGE;
		}
		if (ans.equals("magenta")) {
			color = Color.MAGENTA;
		}

		rob.setPenColor(color);
		rob.penDown();
		rob.move(num);

	}
}
