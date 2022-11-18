package program;

public class ReverseString {
	static String rev="";

	public static void main(String[] args) {

		String str = "Rohan";
		System.out.println(reverse(str));
		RevBuffer(str);
	}

//	public static String reverse(String in) {
//		if (in == null)
//			throw new IllegalArgumentException("Null is not valid input");
//		StringBuilder out = new StringBuilder();
//		char[] chars = in.toCharArray();
//		for (int i = chars.length - 1; i >= 0; i--)
//			out.append(chars[i]);
//		return out.toString();
//	}

	public static String reverse(String in) {
		for (int i = in.length()-1; i >= 0; i--) {
			rev = rev + in.charAt(i);
		}
		return rev;
	}
	
	public static void RevBuffer(String in) {
		StringBuffer buffer = new StringBuffer(in);
		System.out.println(buffer.reverse());
	}
}
