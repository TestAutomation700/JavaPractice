package JavaPrograms.SampleJavaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter the number: ");
		
		int inp_num = sc.nextInt();
		
		int flag=0;
		
	   for(int i=2;i<=inp_num/2;i++) {
		   
		   if(inp_num%i==0) {
			   flag=1;
			   break;
			   
		   }
		   
	   }
	   
	   if (flag==0) {
		   System.out.println("its a prime number");
	   }
	   else
		   System.out.println("its not a prime number");
	}

}
