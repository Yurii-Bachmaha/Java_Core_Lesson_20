package task01;

import java.util.Scanner;

public class InputValue {

	public static int quantity() {
		System.out.println("Enter how much Fibonacci numbers need to be displayed:");
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		if (scanner.hasNextInt()) {
			count = scanner.nextInt();
		} else {
			System.out.println("Try again");
			System.exit(0);
		}

		scanner.close();
		return count;
	}
}