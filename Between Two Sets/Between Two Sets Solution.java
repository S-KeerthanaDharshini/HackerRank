import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr1[] = new int[m];
		int arr2[] = new int[n];
		int min=Integer.MAX_VALUE;
		for(int i=0;i<m;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			
			if(min > arr2[i]) {
				min=arr2[i];
			}
		}
		int value=0;
		int count=0;int vcount=0;
		for(int i=1;i<=min;i++) {
		   count=0;
		   vcount=0;
		   for(int j=0;j<m;j++) {
			   if(i % arr1[j] ==0) {
				   count++;
			   }
		   }
		   if(count == m) {
			   for(int k=0;k<n;k++) {
				   if(arr2[k] % i == 0) {
					   vcount++;
				   }
			   }
			   if(vcount==n) {
				   //System.out.println(i);
				   value++;			  
				   }
		   }
		  }
		System.out.println(value);	
	}
}
