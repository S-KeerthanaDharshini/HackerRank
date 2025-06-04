import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int s= sc.nextInt();
		int t =sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		int marr[]=new int[m];
		int narr[]=new int[n];
		int sum=0;
		int asum=0;
		int acount=0;
		int bcount=0;
		for(int i=0;i<m;i++) {
			marr[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			narr[j]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
		sum=0;
		sum=marr[i] + a;
		if(sum >=s  && sum <=t ) {
			acount++;
		}
		}
		for(int j=0;j<n;j++) {
			asum=0;
			asum=narr[j]+b;
			if(asum >=s && asum<=t) {
				bcount++;
			}
		}
			System.out.println(acount);
			System.out.println(bcount);
	}
}
