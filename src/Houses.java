import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		Robot key = new Robot();
		for(int i = 1 ; i<= 4; i ++ ){
			drawHouse(key);
		}
	}

	static void drawHouse(Robot key) {
		key.moveTo(50, 900);
		key.setSpeed(10);
		key.penDown();
		key.setPenWidth(3);
		key.setPenColor(Color.BLUE);
		key.move(300);
		key.turn(45);
		key.move(200);
		key.turn(90);
		key.move(200);
		key.turn(45);
		key.move(300);
		key.turn(-90);
		key.move(50);

	}
}
