package org.demo.maventest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class javaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aaabccd";
		
		char[] charArr = s.toCharArray();
		
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		 for(int i=0; i<charArr.length;i++) {
			 if(hmap.containsKey(charArr[i])) {
				 hmap.put(charArr[i], hmap.get(charArr[i])+1);
			 }
			 else {
				 hmap.put(charArr[i],1);
			 }
		 }
		 
		 System.out.println(hmap);	
		 
		 Set p = hmap.entrySet();
		 Iterator iter = p.iterator();
		 
		 while(iter.hasNext()) {
			 
			 Map.Entry map = (Map.Entry) iter.next();
			 
			 if(map.getValue().equals(1)) {
				 
				 System.out.println("Unique characters is "+map.getKey()+map.getValue());
				 
			 }
			 
		 }

	}

}
