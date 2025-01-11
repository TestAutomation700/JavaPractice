package regularexpression;

import java.util.regex.Pattern;

public class RegexSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str = "This is a Program";
		//String[] strArr = str.split("\\s"); //split using space
		
		/*
		 * we can use String split instead of StringTokenizer.
		 * StringTokenizer is a legacy class used in v1.0
		 */
		
		String str = "https://www.google.com";
		String[] strArr = str.split("\\//|\\:|\\."); //splits with "//" or ":" or "."
		
		for(String st:strArr)
			System.out.println(st);

	}

}
