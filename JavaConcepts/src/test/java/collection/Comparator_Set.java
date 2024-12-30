package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparator_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Comparator is used to custom sort the objects
		 * applicable for Map, Set and List
		 * compare method is used
		 * if return is 1, then the object should move to right/forward
		 * if return is -1, then the object should move to the left/backward
		 */

		Comparator<String> comp = new Comparator<String>() {
			@Override

			public int compare(String o1, String o2) {

				// TODO Auto-generated method stub

				if (o1.compareTo(o2) < 0) {
					
		//sample: ABC<Street is negative as it compares as per dictionary
	    //but return is 1 -> ABC will move to the right/forward of Street. o/p: Street,ABC
					
					return 1;  

				}
				
	   //sample: ABC<String is negative as it compares as per dictionary
	   //but return is -1 -> ABC will move to the left/back of Street. o/p: ABC, Street
				
				else {

					return -1;

				}

			}
		};

		TreeSet<String> tset = new TreeSet<String>(comp);

		// Displays in alphabetical order

		tset.add("ABC");
		tset.add("String");
		tset.add("Test");
		tset.add("Pen");
		tset.add("Ink");
		tset.add("Jack");
		System.out.println(tset);

	}

}
