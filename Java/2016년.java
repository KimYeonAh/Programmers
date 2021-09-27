class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        
        int num = 0;
        
        if(a > 1){
            for(int i = 0; i < a-1; i++){
                num += month[i];
            }
            num += b;
        }else{
            num = b;
        }
        
        while(num >= 7){
            num -= 7;
        }
        
        answer = week[num];
        
        return answer;
    }
}
