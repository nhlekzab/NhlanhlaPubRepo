
import java.util.Scanner;

public class sample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x = 0;

		do {
			try {
				System.out.println("Enter first num: ");
				int n1 = input.nextInt();

				System.out.println("Enter second num: ");
				int n2 = input.nextInt();

				int sum = n1 / n2;

				System.out.println(sum);
				x = 2;
			}

			catch (Exception e) {
				System.out.println("You can't do that, try again");

			}
		} while (x == 0);
	}
	
	

}