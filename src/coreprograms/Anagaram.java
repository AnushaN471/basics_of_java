package coreprograms;

import java.util.Arrays;

public class Anagaram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "mary";
		String str1 ="army";

		char[] c1 =	str.toLowerCase().toCharArray();
		char[] c2 =	str1.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2)) {
			System.out.println("given strings are anagaram");
		}else {
			System.out.println("given strings are not anagaram");
		}
}
	}


