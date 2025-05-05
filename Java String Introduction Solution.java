import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum= A.length() + B.length();
	System.out.println(sum);	
	if(A.compareTo(B) == 1 || A.compareTo(B) == 2) {
		System.out.println("Yes");
	}else {
		System.out.println("No");
    }
	String new_word1 =Character.toUpperCase(A.charAt(0))+A.substring(1);
	String new_word2 =Character.toUpperCase(B.charAt(0))+B.substring(1);
	System.out.println(new_word1+" "+new_word2);
    }
}



