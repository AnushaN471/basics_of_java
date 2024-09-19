package coreprograms;

import java.util.HashMap;

public class UppercaseAndLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am A good Student";
		int lowercase =0;
		int uppercase =0;
		int count =0;
		 String arr[] =s.split("");
		 HashMap<String,Integer> map = new HashMap();
		 for( int i =0;i<arr.length;i++) {
			 
		 if(!map.containsKey(arr[i])) {
			 map.put(arr[i], count);
		 }else {
			 map.put(arr[i], map.get(arr[i]+1));
		 }
		
			 for(String x:map.keySet()) {
			 }
			 System.out.println("x"+" "+map.get(arr[i]));
			 
		}

	}

}
