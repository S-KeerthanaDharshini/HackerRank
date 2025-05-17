import java.util.*;
import java.io.*;
public class Subarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		     int letter[]= new int[26];
		     for(int i=0;i<26;i++) {
		    	 letter[i]=sc.nextInt();
		    	 
		     }
		     String input=sc.next();
		     int val[]=new int[input.length()];
		     char arr[]=input.toCharArray();
		     for(int i=0;i<arr.length;i++) {
		    	 val[i] =letter[((int)arr[i])-'a'];
		     }
		     
		     int max=Integer.MIN_VALUE;
		     for(int i=0;i<val.length;i++) {
		    	 if(max < val[i]){
		    		 max=val[i];
		    	 }
		     }
		     System.out.println(arr.length * max);
			 
	}

}
