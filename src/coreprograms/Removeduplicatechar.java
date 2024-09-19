package coreprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//remove duplicate characters ina given string
		String s="privaccyy";
		Set<Character> c=new LinkedHashSet();
		for(int i=0;i<s.length();i++) {
			c.add(s.charAt(i));
		}
		for(Character ch : c) {
			System.out.print(ch);
		}

	}

}
