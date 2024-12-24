package org.demo.maventest;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0;
		int n2=1;
		int temp;
		int count = 10;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<count;i++) {
			
			temp=n1+n2;
			System.out.print(" "+temp);
			n1=n2;
			n2=temp;
			
		}
		

	}

}
