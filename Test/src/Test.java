
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I've 5 yrs exp and i am 20 yrs old";

		/*char[] split_str = str.toCharArray();

		int sum = 0;

		for (int i = 0; i < split_str.length; i++) {
			System.out.println(split_str[i]);

			
			 * if (split_str[i]=='5') { sum=sum+split_str[i]; }
			 
		}*/
		
		char[] c = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                System.out.print("Digits in the String : " + c[i]);
                System.out.println();
                int a = Integer.parseInt(String.valueOf(c[i]));
                sum = sum + a;
            }
        }
        System.out.println("Sum of Digits is : " + sum);

	}
}
