class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long ans = 0;

        for(int i=1; i<=count; i++){
            ans += (price*i);
        }

        answer *= (money-ans);

        if(answer <= 0){ return 0; }
        else{ return answer; }
    }
}
