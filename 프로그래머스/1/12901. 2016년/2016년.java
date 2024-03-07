class Solution {
    public String solution(int a, int b) {
       int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int days=0;
        for(int i=0;i<(a-1);i++) {
            days+=date[i];
        }
        days+=b;
        days-=1;
        int spare=days%7;
        return week[spare];
    }
}