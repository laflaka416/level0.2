import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
public static void main(String[] args) {
	Robot rob = new Robot();
	rob.penDown();
	rob.setPenColor(000,51,221);
	rob.setSpeed(7);
	for(int numTimes = 1; numTimes<=4; numTimes=numTimes+1 ){
	rob.move(100);
	rob.turn(90);
	}
	rob.hide();
}
}
