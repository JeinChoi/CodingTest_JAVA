class Solution {
    public String solution(String s) {
         String answer = "";
        String[] strArr = s.split(" ");
        int max=-9999;
        int min=9999;
        for (String string : strArr) {
            int temp = Integer.parseInt(string);
            if (temp > max)
                max = temp;
            if (temp < min)
                min = temp;
        }
        answer=min+" "+max;
        return answer;
    }
}