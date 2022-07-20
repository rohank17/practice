package program;

import java.util.Scanner;

public class EvenOdd {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n;
		System.out.println("Enter an Integer number:");

		// The input provided by user is stored in num
		Scanner input = new Scanner(System.in);
		n = input.nextInt();

		/*
		 * If number is divisible by 2 then it's an even number else odd number
		 */
//		if (num % 2 == 0)
//			System.out.println("Entered number is even");
//		else
//			System.out.println("Entered number is odd");

		if (n % 2 == 0 || (n >= 2 && n <= 5))
			System.out.println("Weird");
		else if (n % 2 == 0 || (n >= 6 && n <= 20))
			System.out.println("Not Weird");
		else if (n % 2 == 0 || n > 20)
			System.out.println("Not Weird");
	}

}
