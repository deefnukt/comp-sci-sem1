import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("input a number");
		
		
		int y = x;
		int c = x;
		
		int count=1;
		while (true){
			c = c -1;
			y = y * c;
			if (count == x-1){
				break;
		}
		count = count + 1;
		}
	    System.out.println(y);
	}
	
}
