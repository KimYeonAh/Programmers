import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String str = "";
        
        for(int i = 0; i < s.length(); i ++){
            if(Character.isLowerCase(s.charAt(i))){
                answer += s.charAt(i);
            }
            else{
                str += s.charAt(i);
            }
        }

        answer = Change(answer) + Change(str);
        
        return answer;
    }
    
    public String Change(String str){
        char[] StringtoChar = str.toCharArray();
        Arrays.sort(StringtoChar);
        
        String SortedString = "";
        
        for(int i = StringtoChar.length-1; i >= 0; i --){
            SortedString += StringtoChar[i];
        }

        return SortedString;
    }
}
