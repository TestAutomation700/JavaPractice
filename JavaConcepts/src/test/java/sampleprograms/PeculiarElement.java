package sampleprograms;

public class PeculiarElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 3, 2, 3, 4, 4, 5, 6, 6, 6, 7 };
		
		int flag =0;
		
		//print unique elements
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					flag++;
				}
			}
			
			if(flag==1) {
				System.out.println(arr[i]);
			}
			
			flag=0;
		}

	}

}
