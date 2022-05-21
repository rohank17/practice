package program;

import java.util.Iterator;
import java.util.Scanner;

public class SortArrayASC {

	public static void main(String[] args) {

		int count, temp;

		// User inputs the array size
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter number of elements you want in the array: ");
//		count = scan.nextInt();

		int num[] = { 15, 98, 85, 20, 45, 65 };
		for (int i = 0; i < num.length; i++) {
			System.out.println("array value " + num[i]);
		}
//		System.out.println("Enter array elements:");
//		for (int i = 0; i < count; i++) {
//			num[i] = scan.nextInt();
//		}
//		scan.close();
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.print("Array Elements in Ascending Order: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + ", ");
		}
		System.out.print("length is " + num.length);
	}

}
