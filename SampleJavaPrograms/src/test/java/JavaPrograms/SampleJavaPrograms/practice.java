package JavaPrograms.SampleJavaPrograms;

public class practice {
	
	public static void main(String[] args) {
	
		/*
		 * byte b = 127;
		 * 
		 * short s = 32767;
		 * 
		 * int i = 'A';
		 * 
		 * System.out.println(i);
		 * 
		 * 
		 * int[] a = new int[6];
		 * 
		 * 
		 * for(int j=0; j<a.length;j++) {
		 * 
		 * System.out.println(a[j]); }
		 */
    
    
    int[][] x = {{10,20},
    		     {20,30,40}
                };
    
    for(int k=0;k<x.length;k++) {
    	
    	for(int l=0;l<x[k].length;l++) {
    		System.out.print(x[k][l]+" ");
    	}
    	System.out.println();
    }
    
    byte b = 127;
    int a = 25000;
    b=(byte)a;
    Object[] s= {"Praveen", "Vignesh", "Santhosh"};
    for(Object c:s) {
    System.out.println(c);
    }

}
}
