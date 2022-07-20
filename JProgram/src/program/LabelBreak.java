package program;

public class LabelBreak {

	public static void main(String[] args) {
		l1: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("inside inner loop " + j);
				if (j == 5) {
					System.out.println("It's break the stmt");
					break l1;
				}
			}
			System.out.println("Outside inner loop");
		}
		System.out.println("Outside Outer loop");

	}

}
