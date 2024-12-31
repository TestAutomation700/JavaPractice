package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Demo {
	
	public static void main(String[] args) {
		
		/* ArrayList internally uses Array (dynamic Array which grows in size)
		 * used for retrieval operation and not best for insertion or removal
		 * can add null values and duplicate values
		 * Insertion order is preserved */
		
		//ArrayList<String> l = new ArrayList<>();
		List<String> l = new ArrayList<>(); 
		l.add("A");
		l.add("B");
		l.add("D");
	
		//we can directly print collection objects
		//System.out.println(l);
		
		//if we need to print as a list
		for(String s:l) {
			System.out.println(s);
		}
		
		//We can use Iterator		
		Iterator<String> itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
