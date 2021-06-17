import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

        String temp = String.valueOf(n);
        String temp_answer = "";
        Character[] arr = new Character[temp.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp.charAt(i);
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            temp_answer = temp_answer + arr[i];
        }
        answer = Long.parseLong(temp_answer);

        return answer;
    }
}