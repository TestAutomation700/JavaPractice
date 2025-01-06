package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfRepeatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbbc";

		char[] charArr = str.toCharArray();

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		for (int i = 0; i < charArr.length; i++) {

			if (hmap.containsKey(charArr[i])) {
				hmap.put(charArr[i], hmap.get(charArr[i]) + 1);
			}

			else {
				hmap.put(charArr[i], 1);
			}
		}

		System.out.println(hmap);


		for (Map.Entry<Character, Integer> mp : hmap.entrySet()) {
		    if (mp.getValue().equals(1)) {
		        System.out.println(mp.getKey() + " " + mp.getValue());
		    }
		}
	}

}
