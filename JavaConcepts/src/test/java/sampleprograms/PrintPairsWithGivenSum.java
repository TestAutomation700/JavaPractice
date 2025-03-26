package sampleprograms;

public class PrintPairsWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,5,7,-1,5};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==6) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}

}
