class Solution {
    public int solution(int num) {
        int answer = 0;
        long number = num;
        
        for(int i = 1; i <= 500; i ++){
            if(number == 1){
                answer = i-1;
                break;
            }else{
                if(number % 2 == 0){ number /= 2; }
                else{ number = (number*3)+1; }
            }            
        }
        
        if(number != 1 ){ answer = -1; }
        
        return answer;
    }
}
