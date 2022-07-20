package interviews;
//Pubmatic
public class Test1 {

	public static void main(String[] args) {
		String a = "aaaabbbbbccdaa";

		int c = 1;
		for (int i = 0; i < a.length() - 1; i++) {
			if (a.charAt(i) == a.charAt(i + 1)) {
				c++;
			} else {
				System.out.println(a.charAt(i) + " count " + c);
				c = 1;
			}
		}
		System.out.println("count of  " + c);
	}

}
