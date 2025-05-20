import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        java.util.LinkedList<String> list = new java.util.LinkedList<String>();
      int n = s.length();
      for(int i=0;i<n-k+1;i++) {
         list.add(s.substring(i,i+k));
      }
      
      smallest="zzz";
      for(String a : list) {
          if(a.compareTo(largest) > 0) {
              largest = a;
          }
          if(a.compareTo(smallest) < 0) {
              smallest = a;
          }
      }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}