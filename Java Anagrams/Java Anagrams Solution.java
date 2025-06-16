

    static boolean isAnagram(String a, String b) {
        int index =0;
       StringBuilder builder  = new StringBuilder(a);
      if(a.trim().length() != b.trim().length()) {
          return false;
      }
      
      a=a.toLowerCase();
      b=b.toLowerCase();
      char[] arr=a.toCharArray();
      char[] brr=b.toCharArray();
      
      java.util.Arrays.sort(arr);
      java.util.Arrays.sort(brr);
      
      return java.util.Arrays.equals(arr, brr);
            
      
    }

