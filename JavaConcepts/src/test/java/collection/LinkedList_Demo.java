package collection;
 
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* LinkedList internally uses doubly linked list
		 * best for insertion or removal of objects and not suitable for retrieval operation
		 * can add null values and duplicate values
		 * Insertion order is preserved */
		
		List<Integer> l = new LinkedList<>();
		l.add(10);
		l.add(98);
		l.add(78);
	
		//we can directly print collection objects
		//System.out.println(l);
		
		//if we need to print as a list
		for(int s:l) {
			System.out.println(s);
		}
		
		//We can use Iterator		
		Iterator<Integer> itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
