class Solution {
    public int solution(int[] a, int[] b) {
        int answer = a[0] * b[0];
        for (int i = 1; i < a.length; i++) {
            answer = answer + a[i] * b[i];
        }
        return answer;
    }
}