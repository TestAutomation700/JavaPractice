package sampleprograms;

public class DuplicateCharInString {

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
			for(int j=0;j<newStr.length();j++) {
				if(ch[i]==ch[j]) {
					flag++;
				}
			}
			if(flag==0)
			newStr=newStr+ch[i];
		}
		System.out.println(newStr);
	}

}
