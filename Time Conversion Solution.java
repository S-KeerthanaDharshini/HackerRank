import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int h1=(int)a.charAt(0)-'0';
        int h2=(int)a.charAt(1)-'0';
        int hh=(h1*10)+(h2%10);
        if(a.charAt(8)=='A'){
            if(hh==12){
                System.out.print("00");
                for(int i=2;i<=7;i++){
                    System.out.print(a.charAt(i));
                }
            }else{
                for(int i=0;i<=7;i++){
                    System.out.print(a.charAt(i));
                }
                
            }
        }else{
            if(hh==12){
                 for(int i=0;i<=7;i++){
                    System.out.print(a.charAt(i));
                }
                    
                }else{
                    hh=12+hh;
                    System.out.print(hh);
                    for(int i=2;i<=7;i++){
                    System.out.print(a.charAt(i));
                }
                    
                }
        }
        
    }
}
