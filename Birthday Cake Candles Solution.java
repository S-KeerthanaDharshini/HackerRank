
import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
       int max =0;
       for(int i=0;i<n;i++) {
    	  if( max<arr[i]) {
    		   max=arr[i];
    	   }
       }
      for(int i =0 ;i<n;i++) {
	if(max == arr[i]){
	count++;
			}
		}
	System.out.println(count);
	}

}
