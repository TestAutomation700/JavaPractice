package JavaPrograms.Collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("Ramesh", 71);
		map.put("Suresh", 82);
		map.put("Praveen", 90);
		map.put("Bala", 78);

		for (String key : map.keySet()) {

			System.out.println(key + ": " + map.get(key));

		}

	}
}
