import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
/*
* 1. 처음 이용시간대의 끝나는 시간과 다음 이용시간대의 시작 시간이 겹치면 안된다.
*
* */

    static class Time{
        int start;
        int end;
        public Time(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
        public static void main(String[] args) throws IOException {
            var br = new BufferedReader(new InputStreamReader(System.in));
            var tokenizer = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(tokenizer.nextToken());
            Time[] timetable =new Time[N];

            for (int i = 0; i < N; i++) {
                tokenizer=new StringTokenizer(br.readLine());
                timetable[i]=new Time(Integer.parseInt(tokenizer.nextToken()),
                        Integer.parseInt(tokenizer.nextToken()));

            }
            Arrays.sort(timetable, new Comparator<Time>() {
                @Override
                public int compare(Time o1, Time o2) {
                    return o1.start - o2.start;
                }
            });

          Arrays.sort(timetable, new Comparator<Time>() {
              @Override
              public int compare(Time o1, Time o2) {
                  return o1.end - o2.end;
              }
          });

            int count=0;
            int now=0;
            for(int i=0;i<N;i++){
                if(now<=timetable[i].start){
                    count++;
                    now=timetable[i].end;
            }

            }
            System.out.println(count);
        
        }
}