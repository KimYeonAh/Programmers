class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        answer = sum(Math.min(a, b), Math.max(b, a));

        return answer;
    }
    
    public long sum(long first, long last){

        return (last-first+1)*(first + last)/2;
        
    }    
}
