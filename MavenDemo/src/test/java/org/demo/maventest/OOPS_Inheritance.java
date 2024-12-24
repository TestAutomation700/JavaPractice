package org.demo.maventest;


class P {
	
	public void m1() {
		System.out.println("parent class");
	}
}

class C extends P {
	public void m2() {
		System.out.println("child class");
	}
}

public class OOPS_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P p = new P();
		p.m1();
		// p.m2(); //method is undefined - parent object cannot access the child class methods
		
		C c = new C();
		c.m1();
		c.m2();  //here child class object can access both parent class and child class methods
		
		P p1 = new C();
		p1.m1();
		// p1.m2(); //Parent reference can be used to hold child objects but by using that reference we cannot call child specific methods but we can call methods present in parent class

		// C c1 = new P(); //Child reference cant be used to hold the child objects
				

	}

}
