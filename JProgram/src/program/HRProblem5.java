package program;

import java.util.Scanner;

public class HRProblem5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.next();
		System.out.println("Name: " + name);
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		System.out.println("Age: " + age);
		System.out.print("Enter your salary: ");
		double sal = in.nextDouble();
		System.out.println("Salary: " + sal);
		in.close();
	}

}
