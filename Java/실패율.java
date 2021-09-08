import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int player = 0;
        int stage = stages.length;
        int index = 0;
        double fail = 0;
        ArrayList<Double> list = new ArrayList<>();
        
        Arrays.sort(stages);
        
        for(int i = 1; i <= N; i ++){
            for(int j = index; j < stages.length; j ++){
                if(stages[j] != i){
                    index = j;
                    break;
                }
                player++;
            }
            
            if(stage == 0 && player == 0){
                list.add(0.0);
            }else{
                list.add(player/(double)stage);
                stage -= player;
                player = 0;
            } 
        }

        for(int i = 0; i < N; i ++){
            fail = list.get(0);
            index = 0;
            
            for(int j = 1; j < list.size(); j ++){
                if(fail < list.get(j)){
                    fail = list.get(j);
                    index = j;
                }
            }
            
            answer[i] = index+1;
            list.set(index, -1.0);
        }
        return answer;
    }
}
