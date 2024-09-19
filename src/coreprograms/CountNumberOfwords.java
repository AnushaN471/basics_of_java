package coreprograms;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="i am learning learning java java programs java programs";
		String[] arr = str.split(" ");
		Map<String, Integer> map = new HashMap<String,Integer>();
		Integer count =1;
		for(int i =0; i<arr.length;i++) {
			if(!map.containsKey(arr[i])){
				map.put(arr[i], count);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
				
				
			}
			
		}
		for(String x:map.keySet()) {
			System.out.println("the count of "+x+"=:"+map.get(x));
		}
	}
}
		


