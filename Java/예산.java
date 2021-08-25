import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int money = 0;
        
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++){
            if(budget >= money+d[i]){
                money += d[i];
                answer = i+1;
            }    
        }
        
        return answer;
    }
}
