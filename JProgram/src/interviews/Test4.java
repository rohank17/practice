package interviews;

//Pubmatic
public class Test4 {
//
//	Given two strings A and B, find if string B can be obtained by rotating string A by exactly 2 places either
//	in clockwise or anticlockwise direction. The reverse should also be true. If these conditions are met, return True.
//
//			Sample input:
//			A = amazon
//			B = azonam
//
//			Sample output:
//			True

	public static void main(String[] args) {
		String str1 = "amazon";
		String str2 = "azonam";
		int len = str2.length();
		String antiClock = str2.substring(len - 2, len) + str2.substring(0, len - 2);
		System.out.println(antiClock);

	}

}
