package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable_Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Comparable_Student> l = new ArrayList<>();
		
		l.add(new Comparable_Student(105,"Sathya",27));
		l.add(new Comparable_Student(101,"Thara",30));
		l.add(new Comparable_Student(103,"Adithya",28));
		l.add(new Comparable_Student(102,"Bala",33));
		
		Collections.sort(l);
		
		for(Comparable_Student a:l)
		System.out.println(a);

	}

}
