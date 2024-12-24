package JavaPrograms.Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet s = new TreeSet(); //Treeset allows only homogeneous elements
		
		s.add("Test");
		s.add("Test1");
		s.add("Test2");
		//s.add(2); only homogeneous elements
		// s.add(null); null is not allowed in TreeSet
		
Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			
			Object op = (Object)itr.next(); //TypeCasting the object type here
			System.out.println(op); 
	}

}

}