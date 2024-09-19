package coreprograms;

public class OccuranceOfDigitsInNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123467809;
		int count =0;
		while(num>0) {
			num =num/10;
			count++ ;
		}
		System.out.println(+count);

	}

}
