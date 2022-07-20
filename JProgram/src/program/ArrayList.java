package program;

import java.util.*;

public class ArrayList {

	public static void main(String[] args) {
		java.util.ArrayList<String> al = new java.util.ArrayList<String>();
		al.add("Test");
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		System.out.println(al);

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
