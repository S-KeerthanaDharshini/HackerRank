import java.util.*;
import java.io.*;
public class Subarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		     int n=sc.nextInt();
			 int k=sc.nextInt();
			 int arr[]=new int[n];
			 int max=Integer.MIN_VALUE;
			 for(int i=0;i<n;i++) {
				 arr[i]=sc.nextInt();
				 if(arr[i]> max) {
					 max=arr[i];
				 }
			 }
			 int diff=max - k;
			 if(diff > 0) {
				 System.out.print(diff);
			 }
			 else {
				System.out.println("0"); 
			 }
	}

}
