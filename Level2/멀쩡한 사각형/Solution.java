class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public long solution(int w, int h) {
        long answer = 1;
        int temp = 0;
        int gcd = gcd(w, h);

        //한 패턴에 사용하지 못하는 정사각형의 개수 = 패턴 직사각형넓이 - (가로길이 + 세로길이 -1)
        //패턴 -> (w/gcd)*(h/gcd)로 반복됨.
        //넓이 = w*h(정사각형의 개수)
        //넓이 - 한 패턴 직사각형에서 사용하지 못하는거 빼고 최대공약수만큼 곱하기

        answer = ((long) w * (long) h) - ((((long) w / gcd) + ((long) h / gcd) - 1) * gcd);

        return answer;
    }
}