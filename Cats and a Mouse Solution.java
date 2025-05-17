import java.io.*;
import java.util.*;
public class Main{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int queries=sc.nextInt();
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<queries;i++){
            int A=sc.nextInt();
             int B=sc.nextInt();
              int C=sc.nextInt();
              int distA=Math.abs(C-A);
               int distB=Math.abs(C-B);
               if(distA < distB){
                al.add("Cat A");
               }
               else if(distA > distB){
                al.add("Cat B");
               }else{
                al.add("Mouse C");
               }
        }
        for(String i:al){
            System.out.println(i);
        } 
     }
}
