class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String res = "";
         
         int count = 0;

         int total = 0;

         for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '-'){
                total++;
            }
         }

         int firstgroup = total % k;
       
         if(firstgroup == 0){
            firstgroup = k;
         }
        for(int i=0;i<s.length();i++){
          char ch = s.charAt(i);
           if(ch == '-') continue;
           if(ch >= 'a' && ch <= 'z'){
            ch = (char) (ch - 32);
           }
          
          if(count == firstgroup || (count > firstgroup && (count - firstgroup) % k == 0)){
            res += '-';
          }

          res += ch;
          count++;

        } 


        return res;
    }
}