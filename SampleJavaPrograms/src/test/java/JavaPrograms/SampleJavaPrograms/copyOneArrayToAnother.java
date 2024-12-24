package JavaPrograms.SampleJavaPrograms;

public class copyOneArrayToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] orgArray = {10,20,230,40,50};
		
		//Assigning the length of original Array to new Array
		int[] copiedArray = new int[orgArray.length];
		
		//Copying the elements from old to new Array
		for(int i=0;i<orgArray.length;i++) {
			
			copiedArray[i]=orgArray[i];
		}

		//printing the new array elements
		for(int i=0; i<copiedArray.length;i++) {
			System.out.print(copiedArray[i]+" ");
		}
	}

}
