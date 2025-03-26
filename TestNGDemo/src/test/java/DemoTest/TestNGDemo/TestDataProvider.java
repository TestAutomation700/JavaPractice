package DemoTest.TestNGDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	@DataProvider(name="loginData")
	
	/* we are declaring the data in the return statement
	 * return type would be Object type with 2-D array
	 */
	/*public Object[][] data() {
		
		return new Object[][] {
			{"username1","password1"},
			{"username2","password2"},	
			{"username3","password3"}
		};*/
	
	public Object[][] data() throws IOException {
		
	//use the below statment to find path - if csv files is in src/test/resources folder
		//String path = getClass().getClassLoader().getResource("**/*.csv").getPath();
		
		String path = new File("data.csv").getAbsolutePath();
		System.out.println(path);
		BufferedReader br = new BufferedReader(new FileReader(path));
		String line;
		List<Object[]> list= new ArrayList<Object[]>();
		
		br.readLine();
		
		while((line=br.readLine())!=null) {
			String[] labels = line.split(",");
			list.add(labels);
		}
		br.close();
		
		return list.toArray(new Object[0][]);
	}

}
