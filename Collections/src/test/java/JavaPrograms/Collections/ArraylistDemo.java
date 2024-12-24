package JavaPrograms.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(3);
		l.add(5);
		l.add(7);
		l.add(null);
		l.add(null);		
		
		Iterator itr = l.iterator();
		
		while(itr.hasNext()) {
			
			Integer I = (Integer) itr.next();
			System.out.println(I);
			
		}
		
		l.remove(2);
		System.out.println(l);
				
		
	}

}
