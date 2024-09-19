package coreprograms;

public class MethodOverloading {
	int i=0; int j=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo = new MethodOverloading();
		mo.sumOfNum(10, 30);
		mo.sumOfNum(30, 40, 50);
	

	}
	/*public MethodOverloading(int k, int l) {
		this.i=k;
		this.j=l;
	}*/
	public void sumOfNum(int a,int b) {
		i=a;
		j=b;
		
		System.out.println(" sum of i and j is:"+(i+j));
		
	}
public void sumOfNum(int a,int b,int c) {
		
		System.out.println(a+b+c);
}
}
