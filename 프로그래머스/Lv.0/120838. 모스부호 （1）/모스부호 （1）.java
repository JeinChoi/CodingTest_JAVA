class Solution {
    public String solution(String letter) {
String[][]  morse =new String[][] {
             {".-", "a"}, {"-...","b"},{"-.-.","c"},{"-..","d"},{".","e"},{"..-.","f"},
             {"--.", "g"}, {"....", "h"}, {"..", "i"}, {".---", "j"}, {"-.-", "k"}, {".-..", "l"},
             {"--", "m"}, {"-.", "n"}, {"---", "o"}, {".--.", "p"}, {"--.-", "q"}, {".-.", "r"},
             {"...", "s"}, {"-", "t"}, {"..-", "u"}, {"...-", "v"}, {".--", "w"}, {"-..-", "x"},
             {"-.--", "y"}, {"--..", "z"}};
        String[] temp = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<temp.length;i++) {
            for (int j = 0; j < morse.length; j++) {
                if (temp[i].equals(morse[j][0])) {
                    sb.append(morse[j][1]);
                    break;
                }
            }
        }
        return sb.toString();
    }
}