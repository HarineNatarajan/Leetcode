class Solution {
    public String reverseOnlyLetters(String s) {
    
         char[] arr = s.toCharArray();

          int left = 0;
          int right = s.length()-1;
         while(left < right){
            if(!Character.isLetter(s.charAt(left))){
                left++;
            }

            else if(!Character.isLetter(s.charAt(right))){
                right--;
            }

            else{

                 char ch = arr[left];

                arr[left] = arr[right];
                 arr[right] = ch;
                 left++;
                 right--;
            }
            
         
          
    }

    return new String(arr);
    }
}