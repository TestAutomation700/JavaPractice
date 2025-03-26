package sampleprograms;

public class AscendingDescendingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,5,3,8,4,7,10};
		
		int temp;
		
		//Ascending
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		for(int k:arr) {

			System.out.println(k);

	}
		
		System.out.println("---------");
    
		// Descending
      
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		for(int k:arr) {

			System.out.println(k);

	}
		System.out.println("---------");
}
}
