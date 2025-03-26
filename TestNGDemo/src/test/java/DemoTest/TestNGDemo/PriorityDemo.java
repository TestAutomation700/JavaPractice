package DemoTest.TestNGDemo;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	@Test (priority = -1 , groups = "Smoke")
	
	public void testSample() {
		
		System.out.println("Running Maven Test without Test Suffix by making changes in surefire plugin");
		
	}

}
