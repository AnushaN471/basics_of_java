package coreprograms;

public class EvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =1235;
		int evencount =0;
		int oddCount =0;
		while(num>0) {
			int rem = num%10;
			if(rem%2 ==0) {
				evencount++;
			}else {
				oddCount++;
			}
		
		
		num =num/10;
		}
		System.out.println(+evencount);
		System.out.println(+oddCount);

	}

}
