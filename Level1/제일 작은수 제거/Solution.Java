import java.util.*;

class Solution {
    public Object[] solution(int[] arr) {
        List<Integer> temp = new ArrayList<Integer>();
        Object[] answer = {};
        int min = arr[0];
        if (arr.length == 1) {
            temp.add(-1);
            answer = temp.toArray();
        } else {
            for (int i = 0; i < arr.length; i++) {
                temp.add(arr[i]);
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            while (temp.contains(min)) {
                temp.remove((Object) min); //중복된 최솟값 제거 Object 형변환으로 최솟값을 찾아야했음.
            }
            answer = temp.toArray();
        }
        return answer;
    }
}