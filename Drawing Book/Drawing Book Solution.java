import java.util.*;
import java.io.*;
public class Main{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int p=sc.nextInt();
    int end=n/2;
    int target=p/2;
    int l=end-target;
    if(target < l){
        System.out.println(target);
    }else{
        System.out.println(l);
    } 
   }
}
