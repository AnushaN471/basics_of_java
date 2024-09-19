package coreprograms;

public class Reversenumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =12345;
			int rev =0;
			while(num!= 0) {
				rev = rev*10+num%10;
				num = num/10;
				
			}
			System.out.println(+rev);
		}
	int num=123;
	StringBuffer sb = new StringBuffer(String.valueOf(num));
	StringBuffer rev= sb.reverse();


	
	
	
	}
	
	


