public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
          long n = A.length;
        long s = (n * (n+1)) /2;
      long s2n = ((n) * (n+1) * ((2*n)+1 ))  /6;
      long sum =0;
      long squaresum =0 ;
      for(int i =0 ;i<n;i++){
          sum += (long) A[i];
          squaresum +=(long)A[i] * (long) A[i];
      }
      
      
      long value1 = sum - s;
      long value2 = squaresum - s2n;
      value2 = value2 / value1 ;
      long x = (value2 + value1) / 2;
      long y = value2  - x;
        return  new int[]{(int)x,(int)y};
    }
}
