package coreprograms;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = {"java", "ruby","python","c","ruby","c","python"};
		boolean flag = true;
		for(int i= 0;i<s.length; i++) {
			for( int j =i+1;j<s.length; j++) {
				if(s[i].equals(s[j])){
					System.out.println(s[i]);

					
				}


			}
		}
		System.out.println("************************");
		if(flag== false) {
			System.out.println("elements not found");
		}

		/*Set<String> st = new HashSet<String>();
		for(String ss : s) {
			if(st.add(ss)==false) {
				System.out.println("duplicate vales are:"+ss);
			}
		}*/

	}

}
