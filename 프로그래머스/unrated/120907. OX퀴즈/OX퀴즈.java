class Solution {
    public String[] solution(String[] quiz) {
         String[] answer = new String[quiz.length];
        String[][] temp = new String[quiz.length][5];
        for(int i=0;i<temp.length;i++){
            temp[i]=quiz[i].split(" ");
        }
        int result=0;
        for(int i=0;i<temp.length;i++){
            switch(temp[i][1]){
                case "+":
                    result=Integer.parseInt(temp[i][0])+Integer.parseInt(temp[i][2]);
                    break;
                case "-":
                    result=Integer.parseInt(temp[i][0])-Integer.parseInt(temp[i][2]);
                    break;
            }
            if(result==Integer.parseInt(temp[i][4]))
                answer[i]="O";
            else answer[i]="X";
        }

        return answer;
    }
}