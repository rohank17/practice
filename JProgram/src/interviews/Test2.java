package interviews;
//Pubmatic
import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
//		String anagram: Solved
		String str1 = "abcd";
		String str2 = "dabc";

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(ch1);
		System.out.println(ch2);

		if (Arrays.equals(ch1, ch2))
			System.out.println("String is Anagram");
		else
			System.out.println("String is not Anagram");
	}

}
