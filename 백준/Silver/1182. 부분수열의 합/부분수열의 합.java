import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
/*
*  
*  배열의 개수까지 하나씩 증가하면서 더한다
*  앞에 탐색했던 배열값은 더이상 탐색할 필요가 없다
*  visited 배열로 방문 여부를 판단한다
*  탐색이 끝나면 다시 false로 변경한다
*  탐색을 시작할 때마다 다른 경우의 수와 같이 더해지지 않도록 result 변수를 0으로 초기화하고 호출한다
*  방문한 인덱스를 true 처리를 해준 뒤에 탐색해야하는 수가 0일 때 visited가 true인 배열값만 더해준다
*  더한 결과가 목표값과 같다면 경우의수를 증가시킨다.
*
*
* */
    static int count=0;
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());//정수의 개수를 입력
            int sum = Integer.parseInt(st.nextToken());//목표 합계값을 입력
            
            int[] arr = new int[N];
            boolean[] visited = new boolean[N];//정수의 개수에 따른 방문 배열 선언 

            st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++){
                arr[i]=Integer.parseInt(st.nextToken());//정수값 입력
            }
            int result=0;//목표 합계값과 비교하기 위한 변수
            for(int c = 1; c <= N; c++) {//모든 조합을 보기 위해 
                result=0;//반복문이 돌때마다 0으로 초기화
                combination(arr, visited, 0, N, c, result,sum);
            }
            System.out.println(count);
        }

        public static void combination(
                int[] arr,
                boolean[] visited,
                int start,
                int n,
                int r, //4개 중에서 1개 뽑기
                int result,
                int sum
        ) {
            if (r == 0) {
                for (int i =0; i<n; i++) {
                    if (visited[i]) {
                       result+=arr[i];
                    }
                }
                if (result==sum){
                    count++;
                }
                return;
            }

            for (int i = start; i < n; i++) {
                visited[i] = true;
                combination(arr, visited, i + 1, n, r - 1,result,sum);
                visited[i] = false;
            }
        }

}