package SysPropVarDemo.SysPropVar;

import org.testng.annotations.Test;

public class SysVarDemoTest {
	 
	@Test
	
	public void getName () {
		System.out.println(System.getProperty("name"));
	}

}
