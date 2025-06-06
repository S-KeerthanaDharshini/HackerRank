import java.util.*;
import java.io.*;
public class Subarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		     int n=sc.nextInt();
			String s=sc.next();
			char arr[]=s.toCharArray();
			int valley=0;
			int value=0;
			for(int i=0;i<s.length();i++) {
				if(arr[i] == 'D') {
					if(value == 0) {
						valley++;
					}
					value--;
				}else if(arr[i] == 'U'){
	
					value++;
					}
			}
			System.out.println(valley);
	}

}
