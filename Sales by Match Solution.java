import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        int sum=0;
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        	int g = hm.getOrDefault(arr[i], 0);
        	hm.put(arr[i],g+1);
        }
        for(int i:hm.values()) {
        	sum+=(i/2);
        }
        System.out.println(sum);
    }
}
