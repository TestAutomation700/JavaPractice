package sampleprograms;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "seen";
		String newStr="";
		
		char[] ch = str.toCharArray();
		for(char c:ch)
		System.out.println(c);
		System.out.println("------");
		
		for(int i=0;i<ch.length;i++) {
			int flag=0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					flag++;
				}
			}
			if(flag==1)
			System.out.println(ch[i]);
		}
		
	}

}

