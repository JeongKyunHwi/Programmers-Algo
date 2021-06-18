import java.util.*;

class Solution {
    public int[] solution(long n) {
        String temp = String.valueOf(n);
        int[] answer = new int[temp.length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) (n % 10);
            n = n / 10;
        }

        return answer;
    }
}