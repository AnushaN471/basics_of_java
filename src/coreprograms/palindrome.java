package coreprograms;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1221;
		int rev =0;
		int temp;
		temp = num;
		while(num>0) {
			int d = num%10;
			rev = rev*10+d;
			num= num/10;
		}
		if(temp==rev) {
			System.out.println("given number is palindrome");
		}else {
			System.out.println("given num ber is not palindrome");
		}

	}

}
