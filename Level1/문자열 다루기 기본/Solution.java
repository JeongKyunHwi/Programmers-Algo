import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char temp;
        //System.out.println(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (s.length() != 4 && s.length() != 6) {
                answer = false;
                break;
            }
            temp = s.charAt(i);
            if (!Character.isDigit(temp))
                answer = false;
        }
        return answer;
    }
}