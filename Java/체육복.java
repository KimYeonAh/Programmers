import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;

        int num = 0;
        
        int[] countList = new int[n];
        Arrays.fill(countList, 1);
        
        for(int i = 0; i < lost.length; i ++){
            countList[lost[i]-1] --;  
        }
        for(int i = 0; i < reserve.length; i ++){
            countList[reserve[i]-1] ++;  
        }

        num = countList[0];
        
        for(int i = 0; i < n; i ++){
            if(countList[i] == 2){
                if(num == 0){ answer++; num = 1; }
                else{ num = 2; }
            }
            if(countList[i] == 1){
                num = 1;
            }
            if(countList[i] == 0){
                if(num == 2){ num = 1;}
                else{ answer--; num = 0; }
            }
        }

        return answer;
    }

}
