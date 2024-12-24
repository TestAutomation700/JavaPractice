package JavaPrograms.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Object> s = new HashSet<Object>(); //passing arguments <Object> since we add heterogeneous elements 
		s.add("Test");
		s.add(1);
		s.add('a');
		s.add("Sample");
		s.add(null);
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			
			Object op = (Object)itr.next(); //TypeCasting the object type here
			System.out.println(op);  //o/p will not be in sorted format. will be based on the hashcode
		}
		
	}

}
