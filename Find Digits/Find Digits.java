public static int findDigits(int n) {
    int duplicate  = n;
    int count =0;
    while ( n > 0){
        int i = n % 10;
        if( i!=0 && duplicate % i == 0)
            count++;
        n = n/10;
    }
    return count;
}}
