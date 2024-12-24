package org.demo.maventest;

public class ReverseStringUsingIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I Am the King";
		String nstr = "";
		
		char[] charArr = str.toCharArray();
		
		for(int i=charArr.length-1;i>0;i--) {
			
			nstr = nstr+charArr[i];	
			
		}
		System.out.println(nstr);
		
	}

}
