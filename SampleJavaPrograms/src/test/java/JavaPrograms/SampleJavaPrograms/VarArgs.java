package JavaPrograms.SampleJavaPrograms;

public class VarArgs {
	
	public static void sum(int... numbers) { 
		
		int sum=0;
		for(int num: numbers) {
			
			sum=sum+num;
		}
		System.out.println(sum);
	}

	public static void main(String... args) {
		// TODO Auto-generated method stub
		
		sum(1,2,3,4);
		
		sum(2,4,7,8);

	}

}