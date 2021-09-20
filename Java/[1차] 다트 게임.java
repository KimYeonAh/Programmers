import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0 ; i < dartResult.length(); i++){
            //10일 때
            if(dartResult.charAt(i) == '1'){
                if(dartResult.charAt(i+1) == '0'){
                    list.add("10");
                    i++;
                    continue;
                }
            }
            list.add(Character.toString(dartResult.charAt(i)));
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        
        for(int i = 0; i < list.size(); i++){
            //보너스 점수
            if(list.get(i).equals("S") || list.get(i).equals("D") || list.get(i).equals("T")){
                int bonus = 0;
                if(list.get(i).equals("S")){
                    bonus = 1;
                }else if(list.get(i).equals("D")){
                    bonus = 2;
                }else{
                    bonus = 3;
                }
                double score = Math.pow(Integer.parseInt(list.get(i-1)), bonus);
                result.add((int)score);
                count ++;
            }
            //스타상, 아차상
            if(list.get(i).equals("*") || list.get(i).equals("#")){
                int option = 0;
                if(list.get(i).equals("*")){
                    option = 2;
                    if(count != 1){
                    result.set(count - 2, result.get(count - 2) * option);
                    }
                }else{
                    option = -1;
                }
                
                result.set(count - 1, result.get(count - 1) * option);
            }
        }

        for(Integer i : result){
            answer += i;
        }
        
        return answer;
    }
}
