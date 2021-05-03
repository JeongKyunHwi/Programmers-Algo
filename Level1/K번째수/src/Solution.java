import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] temp = array;

        for(int i= 0; i<answer.length; i++){
            int[] temparr = Arrays.copyOfRange(temp,commands[i][0]-1,commands[i][1]);
            Arrays.sort(temparr);
            answer[i] = temparr[commands[i][2]-1];
        }
        return answer;
    }

}