import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int hash[]=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            hash[arr[i]]=hash[arr[i]]+1;
        }
        int max=hash[0];
        int id=0;
        for(int i=0;i<n+1;i++){
            if(max < hash[i]){
             max=hash[i];
             id=i;   
            }
        }
        
        System.out.println(id);
    }
}
