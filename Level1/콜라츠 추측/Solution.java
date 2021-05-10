class Solution {
    public int solution(int num) {
        int answer = 0;
        long temp = num;
        int p =0;
        while(true){
            if(p>500){
                answer = -1;
                break;
            }
            if(temp ==1){
                answer = p;
                break;
            }
            if(temp %2 ==0){
                temp = temp / 2;
            }else{
                temp = (temp * 3) +1;
            }
            p++;
        }
        return answer;
    }
}