import java.util.Random;

public class RandomNumGenerator {
	public static void main() {
		Random rand = new Random(10);
		System.out.println("random number=" + rand.nextInt());
	}
}