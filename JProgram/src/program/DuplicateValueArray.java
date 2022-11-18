package program;

import java.util.HashMap;
import java.util.Map;

public class DuplicateValueArray {

	public static void main(String[] args) {

		int[] numbers = { 2, 2, 2, 4, 5, 6, 7, 7 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : numbers) {
			if (map.containsKey(i))
				map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);
		}
		System.out.println(map);
//		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " time: " + entry.getValue());
//		}
	}
}
