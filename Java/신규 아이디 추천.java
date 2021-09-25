class Solution {
    public String solution(String new_id) {
        String answer = "";
        boolean flag = true;
        char id;
        
        for(int i = 0; i < new_id.length(); i++){
            id = new_id.charAt(i);

            if(id == '.'){
                if(flag == true){ continue; }
                else{ 
                    flag = true;
                    id = '.'; 
                }
            }else{
                if(Character.isUpperCase(id)){
                    flag = false;
                    id = Character.toLowerCase(id);
                }else if(!Character.isLowerCase(id) && id != '-' && id != '_' && id != '.' && !Character.isDigit(id)){
                    continue;
                }else{
                    flag = false;
                }
            }
            
            answer += Character.toString(id);
        }
        
        if(answer.length() > 15){
            answer = answer.substring(0, 15);
        }else if(answer.length() == 0){
            answer = "aaa";   
        }
        
        if(answer.charAt(answer.length()-1) == '.'){
            answer = answer.substring(0, answer.length()-1);
        }
        
        if(answer.length() < 3){
            while(answer.length() < 3){
                answer += answer.charAt(answer.length()-1);
            }
        }
        
        return answer;
    }
}
