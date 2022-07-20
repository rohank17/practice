package interviews;

import java.util.HashSet;
import java.util.Set;
//Pubmatic
public class Test5 {

	public static void main(String[] args) {
//		Print unique set of numbers a,b,c from the list where sum of two adjacent numbers(a,b) matches any number(c) in the list
//		Ex:
//		[1,5,2,6,3,4,9,10,2,6,15,8,21]
//
//		Few set of numbers(a,b,c) which match the above criteria:
//		2,6,8
//		6,15,21
		@SuppressWarnings("unused")
		int total = 0;
		int temp = 0;
		Set<Integer> set = new HashSet<>();
		int[] a = { 1, 7, 2, 6, 3, 4, 9, 10, 2, 6, 15, 8, 21 };
		for (int i = 0; i < a.length - 1; i++) {
			temp = a[i] + a[i + 1];
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] == temp) {
					if (set.add(temp)) {
						System.out.println("values: " + a[i] + a[i + 1] + a[j]);
						break;
					} else {
//						System.out.println("Duplicate: " + a[i] + a[i + 1] + a[j]);
					}
				}
			}
		}
		System.out.println(temp);

//		System.out.println(set);

	}

}
