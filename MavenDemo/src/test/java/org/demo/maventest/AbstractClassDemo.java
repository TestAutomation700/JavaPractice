package org.demo.maventest;

abstract class AbsDemo {

	public abstract void show();

	public abstract void config();

}

class A extends AbsDemo {

	public void show() {
		System.out.println("In Show");

	}

	public void config() {
		System.out.println("In Config");
	}

}

public class AbstractClassDemo {

	public static void main(String[] args) {

		AbsDemo ab = new A();
		ab.show();
		ab.config();

	}

}
