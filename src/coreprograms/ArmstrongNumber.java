package coreprograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//153 =1*1*1+5*5*5+3*3*3
		int num = 153;
		int temp;
		int result =0;
		 temp = num;
		 while(num>0) {
			 int rem = num%10;
			 num = num/10;
			  result =result+(rem*rem*rem);
		 }
		 if(temp==result) {
System.out.println("given number is armstrong");
	}
		 else {
			 System.out.println("given number is not armstrong"); 
		 }
	}
}
			
		 


