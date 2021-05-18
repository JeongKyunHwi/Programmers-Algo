class Solution {
    public String solution(String s) {
        String answer = "";
        char a;

        if (s.length() % 2 == 1) {
            a = s.charAt(s.length() / 2);
            answer = String.valueOf(a);
        } else {
            answer = s.substring((s.length() / 2) - 1, (s.length() / 2) + 1);
        }
        return answer;
    }
}