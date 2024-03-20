class Solution {
    public String solution(String s) {
      String answer="";
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                j=0;
                answer+=" ";
            }else{
                answer+=(j%2==0)?(s.charAt(i)+"").toUpperCase()
                    :(s.charAt(i)+"").toLowerCase();
                j++;
            }
        }
        
        
      return answer;
    }
}