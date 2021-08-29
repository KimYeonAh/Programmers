import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if(s.length() == 4 || s.length() == 6){
            for(int i = 0; i < s.length(); i++){
                answer =  Character.isDigit(s.charAt(i));
                if(answer == false){
                    break;
                }
            }
        }
        
        return answer;
    }
}
