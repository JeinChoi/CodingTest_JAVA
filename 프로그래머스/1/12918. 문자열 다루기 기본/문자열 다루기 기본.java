class Solution {
    public boolean solution(String s) {
        for(int i=0;i<s.length();i++){
            int temp = s.charAt(i)+0;
            if(temp<48||temp>57){
                return false;
                
            }
        }
        if(s.length()==4||s.length()==6)
            return true;
        else return false;
    }
}