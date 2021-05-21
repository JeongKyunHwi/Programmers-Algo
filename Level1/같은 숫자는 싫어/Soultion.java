import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = arr;
        int p = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                p++;
                answer[p] = arr[i + 1];
            }
        }
        answer = Arrays.copyOf(answer, p + 1);
        return answer;
    }
}