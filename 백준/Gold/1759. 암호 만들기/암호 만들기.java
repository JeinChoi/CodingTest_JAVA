import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{

   static int L,C;
   static char[] input;

   static char[] password;

   static Set<Character> moms = Set.of('a','e','i','o','u');
   static StringBuilder answer = new StringBuilder();
    static String result="";
        public static void main(String[] args) throws IOException {
            var br = new BufferedReader(new InputStreamReader(System.in));

            var tokenizer = new StringTokenizer(br.readLine());

            L=Integer.parseInt(tokenizer.nextToken());//암호문자열길이
            C=Integer.parseInt(tokenizer.nextToken());

            input = new char[C];

            tokenizer = new StringTokenizer(br.readLine());
            for(int i=0;i<C;i++){

                input[i]=tokenizer.nextToken().charAt(0);
            }

            Arrays.sort(input);
            password=new char[L];

            combination(0,L,0,0);

            System.out.println(answer);

        }

    private static void combination(
            int start,
            int r,
            int momCount, //모음 개수
            int sonCount //자음 개수
    ) {
        if(r==0){//탈출조건
            if(momCount >=1 && sonCount>=2){//최소 자음 한개고 최소 모음 두개 이상이어야 한다
                answer.append(new String(password)).append("\n");
            }
            return;
        }
        for(int i=start;i<input.length;i++){
            char curChar = input[i];
            password[L-r]=curChar;

            if(moms.contains(curChar)){
                combination(i+1,r-1,momCount+1,sonCount);
            }  else {
                combination(i+1,r-1,momCount,sonCount+1);
            }
        }
    }


}