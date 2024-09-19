package coreprograms;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "#$%^^&&selenium123456Testing*&^%";
		
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));

	}

}
