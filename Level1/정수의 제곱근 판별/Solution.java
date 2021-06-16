import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = -1;

        long sqrt = (long) Math.sqrt(n);
        if (n == Math.pow(sqrt, 2)) {
            return (long) Math.pow(sqrt + 1, 2);
        } else {
            return -1;
        }

      /*for(int i=1; i<=n; i++){
          if(i *i == n){
              return answer = (i+1) * (i+1);
          }
      }
      return answer;*/
    }
}