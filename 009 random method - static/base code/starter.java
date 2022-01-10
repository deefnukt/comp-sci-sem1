import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		double rand_num1 = rand.nextDouble()+20;
		System.out.print(rand_num1);
	}
}
