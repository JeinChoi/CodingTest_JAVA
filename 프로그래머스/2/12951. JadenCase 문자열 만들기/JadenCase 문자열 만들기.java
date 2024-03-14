class Solution {
    public String solution(String s) {
         String answer = "";int counter=1;
         s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            String temp = String.valueOf(s.charAt(i));
           if(temp.equals(" ")){
               answer+=" ";
               counter=1;
           }else{
               if (counter == 1) {
                   answer+=temp.toUpperCase();
                   counter=0;
               }else{
                   answer+=temp;
               }
           }
//           if(String.valueOf(s.charAt(i)).matches("[0-9]")){
//               answer+=String.valueOf(s.charAt(i));
//           }
//           if(String.valueOf(s.charAt(i)).matches("[a-z]")&&s.charAt(i-1)==' '){
//               answer+=String.valueOf(s.charAt(i)).toUpperCase();
//           }
//           else answer+=s.charAt(i);
        }

        return answer;
    }
}