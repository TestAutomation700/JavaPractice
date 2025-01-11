package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Reg-Ex patterns
		 * ^ -> starts with --- example: ^a - check whether given string starts with pattern 'a'
		 * $ -> ends with ---- exmaple: a$ - check whether given string ends with pattern 'a'
		 * [0-9] -> given string has the digits from 0 to 9
		 * [A-Z] -> given string has upper case letters from A to Z
		 * [a-z] -> given string has lower case letters 
		 * ? -> quantifier that makes the preceding element optional --- ex:[0|95]?[0-9] 
		 * above example means, the starting element may or may not be 0 or 95
		 * \\s -> used in split using space character
		 * .* - can search anywhere in the string (atleast) ---- ex: .*[A-Z] at least has one uppercase
		 * 
		 */
		
		String s = "abbabbba";
		Pattern p = Pattern.compile("a$");
		Matcher m = p.matcher(s);
		int count = 0;
		
		while(m.find()) {
			count++;
			System.out.println(m.group()+m.start());
		}
		
		System.out.println(count);
		
	}

}
