class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int temp = 0;
        int temp_x = x;
        while (true) {
            if (temp_x <= 0) break;
            temp = temp + (temp_x % 10);
            temp_x = temp_x / 10;
        }
        if (x % temp == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}