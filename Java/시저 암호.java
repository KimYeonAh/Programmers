class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            if((int)s.charAt(i) == 32){
                answer += " ";
            }else{
                int ascii = (int)s.charAt(i) + n;

                if(Character.isUpperCase(s.charAt(i))){
                    if(ascii > 90){
                        ascii -= 26;
                    }
                }
                else{
                    if(ascii > 122){
                        ascii -= 26;
                    } 
                }
                
                answer += (char)ascii;
            } 
        }

        return answer;
    }
}
