package program;

public class PatternEx2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("*********************With tab***************");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}

		System.out.println("********************* With No***************");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("********************* With another pattern***************");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("********************* Reverse the pattern***************");

		for (int i = 10; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 10; i >= 0; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		for (int i = 10; i >= 0; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		System.out.println("***********print correct*************");
		
		for (int i = 10; i >= 0; i--) {
			for (int j = i; j >= i-1; j--
					) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
