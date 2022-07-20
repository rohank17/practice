package interviews;

public class Test6 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		Reverse given number and check if number is Palindrome or not, if it's not continue to add  reverse number until you get palindrome.

//		7325 (Input Number) + 5237 (Reverse Of Input Number) = 12562
//				12562 + 26521 = 39083
//				39083 + 38093 = 77176
//				77176 + 67177 = 144353
//				144353 + 353441 = 497794 (Palindrome)

		int a = 7325;

//		if (a == rev) {
//			System.out.println("Palindrome");
//		} else {
//			a = rev + a;
//		}
		int rev, val = 0, temp = 0;

		if (val == a) {
			while (a % 10 > 0) {
				rev = a % 10;
				a = a / 10;
				val = (val * 10) + rev;
			}
			System.out.println(val);
		} else {

		}
	}

}
