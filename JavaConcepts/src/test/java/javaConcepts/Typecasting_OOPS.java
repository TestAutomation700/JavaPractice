package javaConcepts;

class Computer {

	public void processor() {

		System.out.println("Inside the processor");

	}

	public void gpu() {

		System.out.println("Graphics unit");
	}
}

class Laptop extends Computer {

	public void display() {

		System.out.println("Laptop Display");
	}
}

public class Typecasting_OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Computer comp = (Computer) new Laptop(); // upcasting which is done implicitly

		Computer comp = new Laptop(); // parent reference - child object which can help access only parent class
										// methods

		comp.processor();

		// to access child class methods, we need to downcast the object reference to
		// child object
		Laptop lap = (Laptop) comp;
		lap.display(); //child class object
	}

}
