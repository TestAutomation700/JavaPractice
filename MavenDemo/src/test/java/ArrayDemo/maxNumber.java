package ArrayDemo;

public class maxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]  arr = {20,10,40,30};
		
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++) {
		
		if(arr[i]>max) 
			max=arr[i];
			
		
	}
		System.out.println(max);
	}
}
