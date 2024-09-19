package coreprograms;

public class Secondmaxnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {2,5,7,6};
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length;j++) {
		if( a[i]<a[j]) {
			int temp =a[i];
			a[i]=a[j];
			a[j]= temp;
		}
	}
}
System.out.println(a[a.length-2]);
	}

}
