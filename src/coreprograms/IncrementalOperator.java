package coreprograms;

public class IncrementalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b= a++; // post increment
		System.out.println(a);
		System.out.println(b);
		
		int x= 22;
		int y=++x; //pre increment
		System.out.println(x);
		System.out.println(y);
		
		int t= -98;
		int u = t --; //post decrement
		System.out.println(t);
		System.out.println(u);
		
		int i= -100;
		int z= --i; //pre decrement
		System.out.println(i);
		System.out.println(z);
		int te =15;
		// int test = --te  + --te + --te;
		 int test = te +5;
		 System.out.println(test);
		 System.out.println(te);
		

	}

}
