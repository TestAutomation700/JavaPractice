package DemoTest.TestNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class GroupDemo {
	
	@Parameters({"url","apikey"})
	
	@Test (priority = 0,groups = "Regression")
	
	public void withoutTest(String url, String key) {
		
		System.out.println("Running maven test with Test suffix");
		System.out.println(url + key);
	}
	
	@Test (priority = -1, groups = "Smoke")
	public void Aemo() {
		System.out.println("checking priority 0");
	}
	


}
