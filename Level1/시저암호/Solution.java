class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char alpha;
        //캐릭터형변환 안해주면 숫자로 출력됨

        for (int i = 0; i < s.length(); i++) {
            alpha = s.charAt(i);
            if (alpha >= 'a' && alpha <= 'z') {
                if (alpha + n > 'z') answer = answer + (char) (alpha + n - 26);
                else answer = answer + (char) (alpha + n);
            } else if (alpha >= 'A' && alpha <= 'Z') {
                if (alpha + n > 'Z') answer = answer + (char) (alpha + n - 26);
                else answer = answer + (char) (alpha + n);
            } else {
                answer = answer + (char) alpha;
            }
        }

        return answer;
    }
}