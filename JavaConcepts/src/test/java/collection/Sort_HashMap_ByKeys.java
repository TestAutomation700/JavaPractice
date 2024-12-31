package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sort_HashMap_ByKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> hashmap = new HashMap<>();
		List<String> list = new ArrayList<>(); // SEE THE DIFFERENCE> ARRAYLIST IS CREATED FOR STRING

		hashmap.put("Mango", 75);
		hashmap.put("Avocado", 80);
		hashmap.put("Honeydew", 90);
		hashmap.put("Blueberries", 45);
		hashmap.put("Cranberries", 60);

		System.out.println(hashmap);

		// CODE STARTS HERE

		for (Map.Entry<String, Integer> m : hashmap.entrySet()) {

			list.add(m.getKey());

		}

		Collections.sort(list);

		for (String a : list) {

			for (Map.Entry<String, Integer> m : hashmap.entrySet()) {

				if (a.equals(m.getKey())) {

					System.out.println("SORT WITH VALUES - Key is " + m.getKey() + " and value is " + m.getValue());

				}

			}

		}

	}

}
