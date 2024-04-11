import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
/*
* 최대 y값과 x값을 구해라
*
* */
        public static void main(String[] args) throws IOException {
            var br = new BufferedReader(new InputStreamReader(System.in));

            int N=Integer.parseInt(br.readLine());
            int[][] degrees = {{1,0},{0,-1},{-1,0},{0,1}};

            StringBuilder sb = new StringBuilder();

            for(int i=0;i<N;i++){

                int direction =0;int x=0;int y=0;
                int maxX=0;int maxY=0;
                int minX=0;int minY=0;
                int straight=1;

                char[] turtleRoute=br.readLine().toCharArray();

                for(int j=0;j< turtleRoute.length;j++){
                    switch (turtleRoute[j]){
                        case 'L':
                            direction=(direction-1)<0?3:(direction-1);
                            continue;
                        case 'R':
                            direction=(direction+1)%4;
                            continue;
                        case 'F':
                            straight=1;
                            break;
                        case 'B':
                            straight=-1;
                            break;
                    }
                    x+= degrees[direction][0]*straight;
                    y+= degrees[direction][1]*straight;

                    if(maxX<x)
                        maxX=x;
                    if(maxY<y)
                        maxY=y;

                    if(minX>x)
                        minX=x;
                    if(minY>y)
                        minY=y;

                }
                sb.append((Math.abs(minX)+Math.abs(maxX)) *(Math.abs(minY)+Math.abs(maxY))).append("\n");

            }

            System.out.println(sb);
        }

}