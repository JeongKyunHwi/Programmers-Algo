import java.util.*;

class Solution {
    public Object[] solution(int[] numbers) {
        Object[] answer = {};
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!temp.contains(numbers[i] + numbers[j]))
                    temp.add(numbers[i] + numbers[j]);
            }

        }
        answer = temp.toArray();
        Arrays.sort(answer);
        return answer;
    }
}