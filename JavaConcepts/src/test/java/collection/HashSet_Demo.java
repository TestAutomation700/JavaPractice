package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* HashSet stores the object using hash-code
		 * used when we need to store unique elements
		 * can add null values and duplicate are not allowed.
		 * Insertion order is not preserved */
		
		Set<Integer> set = new HashSet<>();
		set.add(18);
		set.add(87);
		set.add(95);
	    set.add(20);   //duplicate will not be stored
	    set.add(null); //can add only one null value
	    
		//we can directly print collection objects
		//System.out.println(l);
		
		//if we need to print as a list 
		for(Integer s:set) {
			System.out.println(s);
		}
		
		//We can use Iterator		
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
