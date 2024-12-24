
public class sample {
	
	public static void main(char args) {
		System.out.println("overloaded main method");
	}

	public static void main(String[] args) {
		
		sample.main('a');
		
		try
		{ int y=10/0;
		}

		/*
		 * catch(ArithmeticException e) { e.printStackTrace(); }
		 */
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception Handled");
		}
		
		
	}
}
