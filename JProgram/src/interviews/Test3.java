package interviews;
//Pubmatic
public class Test3 {

	public static void main(String[] args) {
		// Reverse number without using string

		int i = 12345;
		int rev = 0;
		while (i % 10 > 0) {
			int temp = i % 10;
			rev = (rev * 10) + temp;
			i = i / 10;
		}
		System.out.println("Ouput " + rev);
	}

}
