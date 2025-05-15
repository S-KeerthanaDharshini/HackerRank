import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[][]=new int[n][n];
        int lr=0;
        int rl=0;
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               arr[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    lr+=arr[i][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i+j)==n-1){
                    rl+=arr[i][j];
                }
            }
        }
        int answer=(lr>rl)?(lr-rl):(rl-lr);
        System.out.println(answer);
    }
 }
