package coreprograms;

public class Descendingarray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x= {2,4,6,8,5};
		int len =x.length;
		for(int i=0;i<x.length; i++) {
			
			System.out.println(x[i]);}
		System.out.println("************");
		for(int i=0;i<x.length;i++) {
		
			for(int j=0; j<x.length;j++ ) {
				int temp= x[i] ;
				 if(x[i]>x[j]) {
					 x[i]= x[j];
					 x[j] =temp;
				 }
			}
		}
		for(int i=0;i<x.length; i++) {
			
			System.out.println(x[i]+ "");
			//SECOND MAX NUMBER
		}

	}
}

