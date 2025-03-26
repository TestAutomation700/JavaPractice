package streams;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring the array
		int[] arr = {2,5,7,1,9,10};
		
		// we are collecting array as stream of objects and do parallel processing
		
		Arrays
		.stream(arr)
		.sorted()  //sort the stream
		.forEach(s->System.out.println(s)); 
		
	//ForEach(System.out::println)- this will print the same output as that of above statement

	}

}
