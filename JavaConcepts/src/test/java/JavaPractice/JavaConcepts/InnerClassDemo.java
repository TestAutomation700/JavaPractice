package JavaPractice.JavaConcepts;

class OuterClass {

	// outer-class method
	public void show() {
		System.out.println("In a Show");
	}

	// Non-static Inner class
	/*
	 * class InnerClass { public void config() {
	 * System.out.println("In Non-static class config method"); } }
	 */

	// Static Inner-Class
	static class InnerClass {
		public void config() {
			System.out.println("In static Inner class config method");
		}
	}

}

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// to access outer-class methods create object of outer-class

		//OuterClass oc = new OuterClass();
		//oc.show();

		// ************************ Non-Static Inner Class **************************

		// syntax to create object for Non-Static Inner-class
		// outerclassname.innerclassname innerclassreference = outerclassobjectrefrence.new innerclassname();

		// OuterClass.InnerClass ic = oc.new InnerClass();
		// ic.config();

		// ************************ Static Inner Class **************************
		// syntax to create object for Static Inner-class
		// outerclassname.innerclassname innerclassreference = new outerclassname.innerclassname();

		//OuterClass.InnerClass ic = new OuterClass.InnerClass();
		//ic.config();
		
		/* ******************* Anonymous Inner Class **************** 
		 * this is used when the method is not frequently used (not more than once)
		 * instead of creating separate class, we can create class after creating object
		 * */
			OuterClass oc = new OuterClass () {
			public void show() {
				System.out.println("in Anonymous inner class method");
			}
		};
		   oc.show();

	}

}
