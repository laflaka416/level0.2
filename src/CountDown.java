import java.util.Random;

public class CountDown {
	public static void main(String[] args) {
		Random num = new Random(5);
		for (int i = 15; i >= 0; i = i - 1) {
			int myNumber = num.nextInt();
			if (myNumber % 3 == 0) {
				System.out.println(myNumber);
			}
		}

	}
}