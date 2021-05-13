class Solution {
    public int gcd(int a, int b) { // 유클리드 호제법
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public int lcm(int a, int b) { //최소공배수 = 두수의 곱 / 두수의 최대공약수
        return (a * b) / gcd(a, b);
    }

    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }
}