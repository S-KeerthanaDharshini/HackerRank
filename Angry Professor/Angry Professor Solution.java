 public static String angryProfessor(int k, List<Integer> a) {
    // Write your code here
           String value="";int count =0;
           for(int s: a){
           if(s<=0){
           count++;
             }
              }
if(count >= k){
    value = "NO";
    }
    else{
        value = "YES";
    }
return value;
}
}