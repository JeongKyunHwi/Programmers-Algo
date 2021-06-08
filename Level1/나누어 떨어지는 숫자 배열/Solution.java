import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> tempanswer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                tempanswer.add(arr[i]);
            }
        }
        int[] answer = new int[tempanswer.size()];
        if (tempanswer.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = tempanswer.get(i);
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}