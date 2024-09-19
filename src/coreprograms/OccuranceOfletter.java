package coreprograms;

public class OccuranceOfletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am a automation test engineer";
		int result = str.length()-str.replaceAll("e", "").length();
		System.out.println(result);

	}

}
