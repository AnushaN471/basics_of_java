package coreprograms;

import java.util.Arrays;

public class LargestAndsmallestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,2,3,55,-100,333};
		int largest =num[0];
		int smallest = num[0];
		for(int i =1;i<num.length;i++) {
			if(num[i]> largest) {
			largest = num[i];
			}
			else {
				if(num[i]>smallest) {
					smallest = num[i];
				}
			}
		}
		
		System.out.println("the numbrers are:" +Arrays.toString(num));
		System.out.println( +largest);
		System.out.println(+smallest);

	}

}
