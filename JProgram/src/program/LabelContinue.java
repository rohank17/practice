package program;

public class LabelContinue {

	public static void main(String[] args) {
		l1: for (int i = 0; i < 10; i++) {
			System.out.println("Inside Outer Loops");
			for (int j = 0; j < 10; j++) {
				if (j == 5) {
					System.out.println("Inside if before label contine ");
					continue l1;
				}
				System.out.println(i + "         " + j);
			}
		}
	}

}
