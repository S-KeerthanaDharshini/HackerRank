import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[3];
        int b[]=new int[3];
        int avalue=0,bvalue=0;
        
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<3;j++){
            b[j]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            if(a[i] > b[i]){
                avalue++;
            }else if(a[i] < b[i]){
                bvalue++;
            }
        }
        
        System.out.println(avalue+" "+bvalue);
        
        
        
    }
}
