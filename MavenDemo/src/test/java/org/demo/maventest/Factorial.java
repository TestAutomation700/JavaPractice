package org.demo.maventest;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//5! = 5*4*3*2*1 = 120
		
		int fact = 1;
		
		int num=7;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		
		System.out.println(fact);

	}

}
