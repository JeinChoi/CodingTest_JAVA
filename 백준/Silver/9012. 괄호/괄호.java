import java.io.*;import java.lang.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> all = new ArrayList<String>();
        int j;
        int flag;

        for(int i=0;i<n;i++){
            String jul = br.readLine();
            all.add(jul);
        }
        for(int i=0;i<n;i++){
            j=0;
            flag=0;
            while(true){
                try{
                    if(String.valueOf((all.get(i)).charAt(j)).equals("(")){
                      flag++;
                    }
                    if(String.valueOf((all.get(i)).charAt(j)).equals(")")){
                      flag--;
                        if (flag<0) {

                            System.out.println("NO");
                            break;
                        }
                    }

                }catch (StringIndexOutOfBoundsException e){
                    if(flag>0){
                        System.out.println("NO");
                    }
                        break;
                }
                j++;
            }
            if(flag==0){
                System.out.println("YES");
            }


        }


    }
}

