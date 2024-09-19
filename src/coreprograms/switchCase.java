package coreprograms;

public class switchCase {
	//wap to given alpabet is voel or consonent
	
	//int,byte,short,char,String ---valid in switch
	//float,double,long,boolean --not valid
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch ='e';
		switch(ch) {
		case'a':
			System.out.println(ch + " is voewl");
			break;
		case 'e':
			System.out.println(ch + " is a vowel");
			break;
		case 'i':
			System.out.println(ch + " is a vowel");
			break;
		case 'o':
			System.out.println(ch + " is a vowel");
			break;
		case 'u':
			System.out.println(ch + " is a vowel");
			break;
		case 'k':
			System.out.println(ch + " is a vowel");
			break;
			default:
				System.out.println("enter the correct character");
				break;
			
		}
			
		
		
		

	}

}
