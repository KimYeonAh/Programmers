import java.util.*;
 
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++){
            list.clear();
            
            for(int j = commands[i][0]; j <= commands[i][1]; j++){
                list.add(array[j-1]);
            }
            
            list.sort(null);
            answer[i] = list.get(commands[i][2]-1);
        }
        return answer;
    }
}
