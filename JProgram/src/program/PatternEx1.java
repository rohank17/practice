package program;

public class PatternEx1 {

	public static void main(String[] args) {
		// Write Java code to display the following pattern
		/*
		 * ********** ********** ********** ********** ********** till 10
		 * 
		 */
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("******************'\'t example*********  ");
		// If we have to provide any tab

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("* \t");
			}
			System.out.println();
		}

		System.out.println("****************** Change the pattern logic *********  ");
		// If we have to provide any tab

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
		System.out.println("****************** Change the pattern logic *********  ");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print((char)(64 + j));
			}
			System.out.println();
		}

	}

}
