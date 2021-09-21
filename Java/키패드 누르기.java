class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int right = 10;
        int left = 11;
        Integer[][] key = {{4, 2}, {1, 1}, {1, 2}, {1, 3}, 
                           {2, 1}, {2, 2}, {2, 3}, 
                           {3, 1}, {3, 2}, {3, 3}, 
                           {4, 1}, {4, 3}};
        
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                left = numbers[i];
                answer += "L";
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                right = numbers[i];
                answer += "R";
            }else{
                int leftNum = Math.abs(key[numbers[i]][0]- key[left][0]) + Math.abs(key[numbers[i]][1]- key[left][1]);
                int rightNum = Math.abs(key[numbers[i]][0]- key[right][0]) + Math.abs(key[numbers[i]][1]- key[right][1]);
                
                if(leftNum > rightNum){
                    right = numbers[i];
                    answer += "R";
                }else if(leftNum < rightNum){
                    left = numbers[i];
                    answer += "L";
                }else{
                    if(hand.equals("right")){
                        right = numbers[i];
                        answer += "R";
                    }else{
                        left = numbers[i];
                        answer += "L";
                    }
                }
            }
        }

        return answer;
    }
}
