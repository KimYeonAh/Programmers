class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }
        return answer;
    }
}

// import java.util.*;
// class Solution {
//     public int solution(int[] numbers) {
//         int answer = 0;
        
//         Arrays.sort(numbers);

//         int num = 0;
//         for(int i = 0; i < numbers.length; i++){
//             if(numbers[i] != num){
//                 for(int j = num; j < numbers[i]; j ++){
//                     answer += j;
//                 }
//                 num = numbers[i];                
//             }            
//             num++;
//         }
        
//         if(num != 10){
//             for(int i = num; i < 10; i++){
//                 answer += i;
//             }
//         }
        
//         return answer;
//     }
// }
