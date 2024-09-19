package coreprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method st
	List<String> ls = new ArrayList<String>(Arrays.asList("apple","banana","apple"));
	Set<String> set = new HashSet<String>(ls);
	System.out.println(set);
	//LinkedHashSet<String> lh = new LinkedHashSet<String>(ls);
	//List<String> list= new ArrayList<String>(lh);
	//System.out.println(list);
	
	
	
	}

}
