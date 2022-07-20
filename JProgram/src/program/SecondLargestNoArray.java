package program;

public class SecondLargestNoArray {
	public static void main(String[] args) {

		int[] a = { 3, 4, 8, 3, 10 };
		System.out.println(findSecondHighest(a));
	}

	private static int findSecondHighest(int[] array) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i : array) {
			if (i > highest) {
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest) {
				secondHighest = i;
			}

		}
		return secondHighest;
	}
}
