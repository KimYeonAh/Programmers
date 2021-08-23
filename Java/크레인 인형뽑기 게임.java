import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < moves.length; i++){
            for(int j = 0; j < board.length; j++){
                
                if(board[j][moves[i]-1]!=0){
                    list.add(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    
                    if(list.size()>=2 && burst(list)){
                        list.remove(list.size()-1);                        
                        list.remove(list.size()-1);
                        answer+=2;
                    }
                    break;
                }  
            }
        }     
        return answer;
    }
    
    public boolean burst(ArrayList<Integer> list){
        
        if(list.get(list.size()-1)==list.get(list.size()-2)){
            return true;
        }
        
        return false;
    }
}
