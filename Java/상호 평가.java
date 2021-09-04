import java.util.*;

class Solution {
    public String solution(int[][] scores) {
        String answer = "";
        int tmp = 0;
        
        for(int i=0; i<scores.length; i++){
            int count = 0;
            int num = 0;
            tmp = scores[i][i];
            
            for(int j=0; j<scores.length; j++){
                if(i!=j){
                    num += scores[j][i];
                    
                    if(tmp > scores[j][i]){
                        count++;
                    }else if(tmp < scores[j][i]){
                        count--;
                    }
                }
            }
            double result = 0;
        
            if(count == (scores.length-1) || count == (-1)*(scores.length-1)){
                result = num/(scores.length-1);
            }else{
                result = (num + tmp)/scores.length;
            }
            answer = level(result, answer);
        }
        
        return answer;
    }
    
    public String level(double result, String answer){
        if(result >= 90){
            answer += "A";
        }else if(result >=80 && result < 90){
            answer += "B";
        }else if(result >=70 && result < 80){
            answer += "C";
        }else if(result >=50 && result < 70){
            answer += "D";
        }else if(result < 50){
            answer += "F";
        }
        
        return answer;
    }
}
