package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Tree-Set underlying data structure is Red-Black tree
		 * used when we need to store unique elements
		 * cannot add null values and duplicate are not allowed.
		 * Elements are stored in a sorted order
		 * follows natural sorting whether or not Comparator is declared  */
		
		Set<Integer> treeset = new TreeSet<>();
		treeset.add(18);
		treeset.add(87);
		treeset.add(95);
	    treeset.add(20);   //duplicate will not be stored
	   // treeset.add(null); //null is not accepted by treeSet
	    treeset.add(20);
	    
		//we can directly print collection objects
		//System.out.println(l);
		
		//if we need to print as a list 
		for(Integer s:treeset) {
			System.out.println(s);
		}
		
		//We can use Iterator		
		Iterator<Integer> itr=treeset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}



	}
