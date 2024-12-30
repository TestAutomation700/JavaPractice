package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Stores value as key value pair
		 * uses hashtable internally. Allows only one null key
		 * Allows only one null key and duplicate values 
		 * if we try to duplicate key, it will replace the value of corresponding key */
		
		Map<Integer, String> map = new HashMap<> ();
		map.put(101, "Vignesh");
		map.put(102, "Monish");
		map.put(103, "Adharsh");
		map.put(104, "Nandhu");
		map.put(104, "James"); //duplicate key replaced "Nandhu" with "James"
		
		for(Integer k:map.keySet()) {
			System.out.println(k + " : " +map.get(k));
			
		}
		
		Iterator<Map.Entry<Integer, String>> itrMap = map.entrySet().iterator();
		
		while(itrMap.hasNext()) {
			Map.Entry<Integer, String> new_Map = itrMap.next();
			System.out.println(new_Map.getKey() + " = " + new_Map.getValue());
		}

	}

}
