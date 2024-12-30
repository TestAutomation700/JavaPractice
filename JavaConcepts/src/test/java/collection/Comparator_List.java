package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comparator<Integer> comp = new Comparator<Integer>() {

			@Override

			public int compare(Integer o1, Integer o2) {

				// TODO Auto-generated method stub

				if (o1 < o2) {

					return 1; // 1 means reverse
				} else {
					return -1; // -1 means dont

				}

			}

		};

		ArrayList<Integer> aList = new ArrayList<Integer>();

		aList.add(25);

		aList.add(37);

		aList.add(19);

		aList.add(8);

		Collections.sort(aList, comp);

		System.out.println(aList);

	}
}
