class Solution {
    /*public int pibo(int n){
        if(n == 0) return 0;
        if (n ==1) return 1;
        return pibo(n-1)+pibo(n-2);
    }*/
    public int solution(int n) {
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < n; i++) {
            c = (a + b) % 1234567;
            a = b;
            b = c;
        }

        return a;

    }
}