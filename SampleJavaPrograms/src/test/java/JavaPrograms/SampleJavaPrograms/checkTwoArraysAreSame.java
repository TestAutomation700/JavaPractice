package JavaPrograms.SampleJavaPrograms;

import java.util.Arrays;

public class checkTwoArraysAreSame {
	
	public static void main(String[] args) {
		
		int[] a = {2,3,4,5};
		int[] b = {2,3,6,5};
		
		boolean check = Arrays.equals(a,b);
		
		if(check==true) {
			System.out.println("Two Arrays are equal");
		}
		
		else
			System.out.println("Two Arrays are not equal");
	}

}
