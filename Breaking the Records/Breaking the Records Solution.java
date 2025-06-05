import java.util.*;
import java.io.*;
public class Main {
public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
  for(int i=0;i<n;i++) {
      arr[i]=sc.nextInt();
     }
        int high=arr[0];
        int low=arr[0];
        int highrank=0;
        int lowrank=0;
        for(int i=0;i<n;i++) {
        	if(high <arr[i]) {
        		high=arr[i];
        		highrank++;
        	}
        	if(low > arr[i]) {
        		low=arr[i];
        		lowrank++;
        	}
        	
        }
  System.out.println(highrank+" "+lowrank);
	}
}
