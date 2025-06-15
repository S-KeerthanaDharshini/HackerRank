import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		int sum=0;
		int length_count=0;
		int d=sc.nextInt();
		int m=sc.nextInt();
		for(int i=0;i<n;i++) {
			sum=0;
			length_count=0;
		
			for(int j=i;j<i+m;j++) {
                if((j>=n)|| sum>=d){
			break;
				}
				sum+=arr[j];
				length_count++;
				
		}
			if(sum==d && length_count==m) {
				count++;
			}
		}
System.out.println(count);
	}
}
