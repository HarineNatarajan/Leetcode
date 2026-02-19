class Solution {
    public String toGoatLatin(String sentence) {
        String[] arr = sentence.split(" ");
        String latin = "";
        for(int i=0;i<arr.length;i++){
            String word = arr[i];
            String res = "";
            if(word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u' || word.charAt(0) == 'A' || word.charAt(0) == 'E' || word.charAt(0) == 'I' || word.charAt(0) == 'O' || word.charAt(0) == 'U'){
                res += word;
                res += "ma";

                
            }

            else{
                
                for(int j=1;j<word.length();j++){
                    res += word.charAt(j);
                }
                res += word.charAt(0);
                res += "ma";

            }


            for(int k=0;k<=i;k++){
                res += "a";
            }

           
            latin += res;

            if(i != arr.length-1){
            latin += " ";
            }

        }

  return latin;

    }
}