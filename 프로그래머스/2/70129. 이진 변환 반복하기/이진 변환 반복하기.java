class Solution {
    public int[] solution(String s) {
          int len=0;String result=s;int total=0;int k=0;
        while(!result.equals("1")) {
            len=0;
            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) == '1')
                    len++;
                else total++;
            }
            result = Integer.toBinaryString(len);
            k++;
        }
        return new int[]{k,total};
    
    }
}