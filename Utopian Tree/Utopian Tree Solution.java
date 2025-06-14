 public static int utopianTree(int n) {
    int count = 0;
    for(int i=0;i<=n;i++){
        if(i % 2 ==0){
            count+=1;
        }
        else if(i % 2 !=0){
            count*=2;
        }
    }
  return count;
    }