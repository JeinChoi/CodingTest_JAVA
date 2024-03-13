import java.util.*;
class Solution {
    static public int solution(String[][] book_time) {
         int[][] realTime = new int[book_time.length][book_time[0].length];

         for(int i=0;i<book_time.length;i++){
            realTime[i][0]=parseTime(book_time[i][0],false);
            realTime[i][1]=parseTime(book_time[i][1],true);
        }
         Arrays.sort(realTime,(a,b)->a[0]-b[0]);//2차원 배열의 0번째 값을 기준으로 오름차순
         PriorityQueue<int[]> inUse = new PriorityQueue<>((a, b) -> a[1] - b[1]);//1번째 값을 기준으로 우선순위.
         int ans = 0;

         for (int i = 0; i < realTime.length; i++) {

             while (!inUse.isEmpty() && inUse.peek()[1] <= realTime[i][0]) {
                 System.out.println(inUse.peek()[1]+" "+realTime[i][0]);
                 inUse.poll();
             }
             inUse.add(realTime[i]);//PriorityQueue에 add가 될 때마다 끝나는 시간 기준으로 오름차순 정렬 된다.
             //가장 빨리 끝나는 시간이 첫번째 값으로.
             ans = Math.max(ans, inUse.size());
         }
         return ans;
    }

    public static int parseTime(String time, boolean end){
        int totalTime=0;
        String[] timeArr = time.split(":");
        for(int i=0;i<2;i++){
            if(timeArr[i].charAt(0)=='0')
                timeArr[i]=timeArr[i].substring(1);
        }
        totalTime+=Integer.parseInt(timeArr[0])*60;
        totalTime+=Integer.parseInt(timeArr[1]);

        if(end){
            totalTime+=10;
        }
        return totalTime;
    }

}