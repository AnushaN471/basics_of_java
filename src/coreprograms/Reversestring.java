package coreprograms;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="welcome to java program"
;
		String stringreverse ="";
		String[] arr =str.split(" ");
		
		for( String w: arr) {
			String reverseWord ="";
			for(int i = w.length()-1;i>=0;i--) {
				reverseWord = reverseWord+w.charAt(i);
			}
		
		stringreverse = stringreverse+reverseWord+" ";
		}
		System.out.println("revers of string is:" +stringreverse );
	}

}
