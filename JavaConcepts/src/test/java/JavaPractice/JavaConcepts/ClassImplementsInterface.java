package JavaPractice.JavaConcepts;

//declaring the class as abstract since all the methods in interface are not implemented

abstract public class ClassImplementsInterface implements TestInterface {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//	int TestInterface.a=1000; // we can't reassign the variables declared in interface, since its implicitly public, static and final
		                           
		int x = TestInterface.a;
		System.out.println(x);

	}

	@Override
	public void sample2() {
		// TODO Auto-generated method stub
		
		
	}


}

//implementing the unimplemented methods in child class through inheritance
class Test extends ClassImplementsInterface {
	
	public void sample3() {
		
	}
	
}
