import java.util.*;
class Solution {
    static boolean[] visit;
    static int depth;

    static public int solution(int[] cards) {
        int answer = 1;
        int len = cards.length;
        visit = new boolean[len+1];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<len;i++) {
            if(!visit[i+1]) {
                depth = 1;
                visit[i+1] = true;
                open(cards[i], cards);
                list.add(depth);
            }
        }//예시를 들면 8이하 1이상의 숫자들을 랜덤으로 나열해서 배열에 넣는다.
        //배열의 순서를 무작위로 하나 뽑아 그안의 숫자를 본다. 그 숫자에 맞게 다른 배열 순서를 뽑는다.
        //그 배열 순서의 있는 숫자를 또 꺼낸다. 1부터 8까지 다 true가 될때까지 반복한다.
        //이때 중간에 끊기지 않고 최대한 오래간 횟수를 기준으로 내림차순을 해서 첫번째 수와 두번째 수를 곱한다.
        if(list.size()<2) {
            return 0;
        }
        Collections.sort(list, Collections.reverseOrder());
        answer = list.get(0) * list.get(1);
        return answer;
    }

    private static void open(int x, int[] cards) {
        if(!visit[x]) {
            visit[x] = true;
            depth += 1;
            open(cards[x-1], cards);
        }
    }
    
}