import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for(int i = 0; i < strings.length-1; i ++){
            for(int j = i+1; j < strings.length; j++){
                if(strings[i].charAt(n) > strings[j].charAt(n)){
                    swap(strings, i, j);
                }
                if(strings[i].charAt(n) == strings[j].charAt(n)){
                    if(strings[i].compareTo(strings[j]) > 0){
                        swap(strings, i, j);
                    }
                }
            }
        }
        
        for(int i = 0; i < strings.length; i ++){
            answer[i] = strings[i];
        }
        
        return answer;
    }
    
    public String[] swap(String[] strings, int i, int j){
        String tmp = "";
        
        tmp = strings[i];
        strings[i] = strings[j];
        strings[j] = tmp;
        
        return strings;
    }
}
