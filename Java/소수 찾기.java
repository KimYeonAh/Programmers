class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int i = 3; i <= n; i ++){
            boolean flag = false;
            
            for(int j = 2; j <= Math.sqrt(i); j ++){
                if(i % j == 0){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                answer ++;
            }
        }
        
        return answer;
    }
}
