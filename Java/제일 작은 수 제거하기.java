import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int num = arr[0];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(arr.length - 1 == 0){
            answer = new int[1];
            answer[0] = -1;
        }else{
            for(int i = 0; i < arr.length; i ++){
                list.add(arr[i]);
            }
            
            for(int i = 0; i < arr.length; i++){
                num = Math.min(num, arr[i]);
            }
            
            for(int i = 0; i < list.size(); i++){
                if(num == arr[i]){
                    list.remove(i);
                }
            }
            
            answer = new int[list.size()];
        
            for(int i = 0; i < list.size(); i++){
                answer[i] = list.get(i);
            }
        }
        
        return answer;
    }
}
