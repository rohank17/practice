package interviews;

import java.util.ArrayList;
import java.util.List;

public class Test7 {

//	I/P 1,5,7,4,3,0,5,5,6,0,0,4,5,4,5
//	O/P 0,0,0,1,5,7,4,5,5,6,3,4,5,4,5

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		int a[] = { 1, 5, 7, 4, 3, 0, 5, 5, 6, 0, 0, 4, 5, 4, 5 };
		int temp;
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] == 0) {
				list.add(a[i]);
			}
		}
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] > 0) {
				list.add(a[i]);
			}
		}
		System.out.println("Expected Output " + list);
	}

}
