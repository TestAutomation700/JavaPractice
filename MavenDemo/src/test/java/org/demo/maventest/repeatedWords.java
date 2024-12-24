package org.demo.maventest;

public class repeatedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Attestation";
		
		s = s.toLowerCase();
		String sv="";
		int j;
		
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			
			for(j=0;j<i;j++) {
				
				if(ch[i]==ch[j]) {
					
					break;
				}
				
			}
			
			if(i==j) {
				sv=sv+ch[i];
				
			}
		}
		
		System.out.println(sv);

	}

}
