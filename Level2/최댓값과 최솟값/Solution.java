import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] temp = s.split(" ");
        int[] StringToInt = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {
            StringToInt[i] = Integer.parseInt(temp[i]);
        }

        Arrays.sort(StringToInt);
        answer = StringToInt[0] + " " + StringToInt[StringToInt.length - 1];

        return answer;
    }
}