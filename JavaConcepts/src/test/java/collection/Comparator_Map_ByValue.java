package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Comparator_Map_ByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*since we need to compare by values, we should use Map.Entry set
		 * we can compare the values using compareTo method
		 */
        Comparator<Map.Entry<String, Integer>> comp = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey()); //compare with keys
               // return o1.getValue().compareTo(o2.getValue()); compare with values
            }
        };

        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        map.put("Arun", 101);
        map.put("Cinda", 109);
        map.put("Rama", 102);
        map.put("Xavi", 100);
        map.put("Maria", 104);
        
        /*
         * we cannot directly apply comparator to map, if we sort by values
         * convert map to list by Map.Entry set
         */

        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>();
        list.addAll(map.entrySet());
        list.sort(comp);

        LinkedHashMap<String, Integer> finalMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            finalMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(finalMap);

}
}
