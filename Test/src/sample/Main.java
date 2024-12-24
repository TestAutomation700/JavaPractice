package sample;

public class Main {
	public int sumOfTheNumbers(String stng) 
	{
	  int l = stng.length();
	  int sum = 0;
	  String temp = "";
	  for (int i = 0; i < l; i++) 
	  {
	    if (Character.isDigit(stng.charAt(i))) 
		{
	      if (i < l-1 && Character.isDigit(stng.charAt(i+1))) 
		  {
	        temp += stng.charAt(i);
	      }
	      else 
		  {
	        temp += stng.charAt(i);
	        sum += Integer.parseInt(temp);
	        temp = "";
	      }
	    }
	  }
	  return sum;
	}

	public static void main (String[] args)
	    {
	      Main m= new Main();
	      String str1 =  "I've 5 yrs exp and i am 20 yrs old";
	      System.out.println("The given string is: "+str1);
	      System.out.println("The sum of numbers in the string is: "+m.sumOfTheNumbers(str1));
		  }

}
