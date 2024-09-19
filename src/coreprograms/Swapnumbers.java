package coreprograms;

public class Swapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int a=10;int b= 20;
		System.out.println("before swap of a:"+ a);
		System.out.println("before swap of b :"+b);
		temp=a;
		b=a+b;
		a= b-a;
		b=b-a;
		System.out.println("after swap of num a;"+a);
		System.out.println("after swap of num b:"+b);
		

	}

}
