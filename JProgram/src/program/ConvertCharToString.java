package program;

public class ConvertCharToString {

	public static void main(String[] args) {
		// Method 1: Using toString() method
		char ch = 'r';
		String str = Character.toString(ch);
		System.out.println("String is: " + str);

		// Method 2: Using valueOf() method
		String str2 = String.valueOf(ch);
		System.out.println("String is: " + str2);
	}

}
