package JavaPrograms.SampleJavaPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "tea";
		String str2 = "eat";

		if (str1.length() != str2.length()) {

			System.out.println("Length does not match. theyare not anagram");
		}

		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();

		Arrays.sort(charArr1);
		Arrays.sort(charArr2);

		boolean output = Arrays.equals(charArr1, charArr2);

		if (output == true) {

			System.out.println(str1 + " and " + str2 + " are anagram");

		}

		else {
			System.out.println(str1 + " and " + str2 + " are NOT anagram");

		}

	}

}
