package org.demo.maventest;

public class WrapperclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		// Integer inte = new Integer(7); //Depreciated. this is boxing
		Integer inte = i; //autoboxing
		System.out.println(inte);
		
		
		int num1 = 7;
		Integer num2=num1;
		// int num3 = Integer.valueOf(num2); //unboxing
		int num3 =  num2; //auto-unboxing
		System.out.println(num3);
		
		String str = "101";
		Integer i1 = Integer.parseInt(str);
		System.out.println(i1);
		

	}

}
