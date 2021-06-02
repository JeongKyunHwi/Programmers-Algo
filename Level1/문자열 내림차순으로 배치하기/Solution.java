import java.util.*;

class Solution {
    public String solution(String s) {
        String[] answer = s.split("");

        Arrays.sort(answer);
        Collections.reverse(Arrays.asList(answer));

      /*for(int i =0; i<answer.length; i++){
          System.out.print(answer[i]);
      }*/
        return String.join("", answer);
    }
}