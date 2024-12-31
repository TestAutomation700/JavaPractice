package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Sort_HashMap_ByValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<>();
		
		ArrayList<Integer> list = new ArrayList<>(); // SEE THE DIFFERENCE> ARRAYLIST IS CREATED FOR INTEGER
		
		map.put("Orange", 90);
		map.put("Strawberry", 70);
		map.put("Pome", 100);
		map.put("Apple", 50);
		map.put("Berrys", 60);
		
		//Map.Entry to treat entry as Map and treating the map as set using entrySet method
		
		for(Map.Entry<String, Integer>m:map.entrySet()) {
			list.add(m.getValue());
		}
		
		Collections.sort(list);
		
		for(Integer a:list) {
			for(Map.Entry<String,Integer> m:map.entrySet()) {
				if(a.equals(m.getValue())) {
					System.out.println(m.getKey() + " : "+m.getValue());
				}
			}
		}
	}

}
