import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        int j = A.length - 1;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer = (A[i] * B[j]) + answer;
            j--;
        }

        return answer;
    }
}