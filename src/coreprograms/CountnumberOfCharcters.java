package coreprograms;

public class CountnumberOfCharcters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="java programing language";
		 int len=str.length();
		 /*for( int i=0;i<len;i++) {
			 char c = str.charAt(i);
			 System.out.println("total number of charcters in string are:"+c);
		 }*/
		 int result=str.length()-str.replaceAll("j", "").length();
		 System.out.println("number of times of j:"+result);

	}

}
