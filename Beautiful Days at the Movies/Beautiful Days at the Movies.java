class Result {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */
 public static int reverse(int num){
        int sum =0;
        int rem=0;
        while(num > 0){
            rem = num % 10;
            sum = sum * 10 +rem;
            num/=10;
        }
        return sum;
     }
    public static int beautifulDays(int i, int j, int k) {
    // Write your code here
    int diff =0;
    int count =0;
    for(int l=i;l<=j;l++){
        diff = Math.abs(l-reverse(l));
        if(diff % k ==0){
            count++;
        }
    }
    return count;
     
    }

}