class Solution {
    public boolean validPalindrome(String s) {
      int i = s.length() - 1;
      int j = 0;

      while(j < i){
        if(s.charAt(j) == s.charAt(i)){
            j++;
            i--;
        }

        else{
            return check(s,j+1,i) || check(s,j,i-1);
        }
      }

      return true;
     


      }


      private boolean check(String s,int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }

            l++;
            r--;
        }
      

    return true;
    }
}