package DemoTest.TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryDemo {
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	
	public void demoFailed (){
		
		Assert.assertEquals(false, true);
		
	}

}
