import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> words = new ArrayList<>();
        int place=0;
        for(int i=0;i<n;i++){
            String word = br.readLine();
            if(word.equals("?"))
                place=i;
            words.add(word);
        }

        char firstLetter=place==0?0:words.get(place-1).charAt(words.get(place-1).length()-1);
        char lastLetter=place==(words.size()-1)?0:words.get(place+1).charAt(0);

        int selectNum = Integer.parseInt(br.readLine());
        for(int i=0;i<selectNum;i++){
            String selection=br.readLine();
             
            if(n==1) System.out.println(selection);
            if(words.contains(selection)) continue;
            
            boolean compareLastLetter = selection.endsWith(lastLetter+"");
            boolean compareFirstLetter = selection.startsWith(firstLetter+"");

            if(firstLetter==0&& compareLastLetter)
                System.out.println(selection);
            else if(lastLetter==0&&compareFirstLetter)
                System.out.println(selection);
            else if(compareFirstLetter&& compareLastLetter)
                System.out.println(selection);
        }
    }
}