package janani;
import java.util.Scanner; 
public class Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n,n1,sum=0;
System.out.println("enter the num");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
n1=ja.nextInt();
int []a=new int[n];
for(i=0;i<n;i++){
	a[i]=ja.nextInt();
}
for(i=0;i<n1;i++){
	sum=sum+a[i];
}
System.out.println(sum);
	}
}
