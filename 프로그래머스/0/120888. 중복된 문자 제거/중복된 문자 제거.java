class Solution {
    public String solution(String my_string) {
          StringBuilder sb = new StringBuilder();
    for(int i=0;i<my_string.length();i++){
        if(sb.toString().contains(my_string.charAt(i)+""))
            continue;
        sb.append(my_string.charAt(i)+"");
    }
    return sb.toString();

    }
}