class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;

        for(int i = 0; i < s.length(); i ++){
            if(count%2 == 0){
                answer += Character.toUpperCase(s.charAt(i));
            }else{
                answer += Character.toLowerCase(s.charAt(i));
            }
            
            count ++;
            
            if(s.charAt(i) == ' '){
                count = 0;    
            }
        }
        
        return answer;
    }
}
