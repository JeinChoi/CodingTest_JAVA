class Solution {
    public String solution(String polynomial) {
      String answer = "";
           String[] temp = polynomial.split(" ");
           int result=0;
           int xResult=0;
           for(int i=0;i<temp.length;i++){
           if(temp[i].contains("x")){
                String num=temp[i].substring(0,(temp[i].length()-1));
                xResult+=Integer.parseInt((num.equals(""))?"1":num);
           } else if (temp[i].equals("+")) {
               continue;
           } else {
               result += Integer.parseInt(temp[i]);
           }

           }
              answer=xResult>=1?((xResult==1?"":xResult)+"x"):"";
           if(xResult!=0&&result!=0)
               answer+=" + ";
           answer+=result>=1?result:"";
           return answer;
    }
}