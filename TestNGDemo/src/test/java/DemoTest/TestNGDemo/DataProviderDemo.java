package DemoTest.TestNGDemo;

import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider="loginData",dataProviderClass=TestDataProvider.class)
	
	public void login(String uname, String pwd) {
		System.out.println("Username: "+uname+" Password: "+pwd);
	}
	

}
