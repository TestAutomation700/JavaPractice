package sample;

public class Javapractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		  
		  for (int i = 0; i < arr.length; i++) { 
			  if (arr[i] % 2 == 0) {
		  System.out.println(arr[i]); 
		  break; }
		  
		  else { System.out.println(arr[i] + " is not a even number"); }
		  
		  }
		 
		  
		  String s = "New clan War";
		 String[] splitstring = s.split(" ");
		 
		 for(String finalstr : splitstring) {
			 System.out.println(finalstr);
		 }
		 
		int str = demomethod();
		System.out.println(str);
		 
		 
	}
	
	public static int demomethod() {
		System.out.println("the program is running fine");
		return 1;
	}
}
