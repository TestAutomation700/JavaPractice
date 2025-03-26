package DemoTest.TestNGDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class TestngListener implements ITestListener {
	
	public void onStart(ITestContext context) {
		System.out.println("before start of the test");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("after finishing the test");
	}
	
}
