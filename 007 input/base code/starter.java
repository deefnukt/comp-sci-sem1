import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name?");
		String text = sc.nextLine();
		System.out.print (text);
		System.out.println("What is your age?");
		int number = sc.nextInt();
		System.out.print (number);
		System.out.print("What is your Birthday month?");
		String test = sc.nextLine();
		System.out.print (test);
	}
}
