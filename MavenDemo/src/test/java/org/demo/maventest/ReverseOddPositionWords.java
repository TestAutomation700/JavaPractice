package org.demo.maventest;

public class ReverseOddPositionWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I Am the King";
		String[] words = str.split(" ");
		String strRev = "";
		int i;
		for (i = 0; i < words.length; i++) {
			char[] ch = words[i].toCharArray();
			if (i % 2 != 0) {
				
				
				for(int j=ch.length-1;j>=0;j--) {
					
					strRev = strRev+ch[j];
					
				}
				
			}else {
				
				strRev = strRev + words[i];
			}
			
			//for spaces
			strRev = strRev+" ";
		}
		
		
	System.out.println(strRev);
		
	}
}
