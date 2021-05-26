class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_num = 0;
        int y_num = 0;
        char a;
        for (int i = 0; i < s.length(); i++) {
            a = s.charAt(i);
            if (a == 'p' || a == 'P') {
                p_num++;
            } else if (a == 'y' || a == 'Y') {
                y_num++;
            }
        }
        if (p_num == y_num) {
            answer = true;
        } else if (p_num != y_num) {
            answer = false;
        } else {
            answer = true;
        }
        return answer;
    }
}