import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            if(i==k){
                continue;
            }
            sum=sum+arr[i];
        }
        int value=0;
        value=b-(sum /2);
        if(value == 0){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(value);
        }
    }
}
