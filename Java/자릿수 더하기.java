import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n != 0){
            answer += n%10;
            n /= 10;
        }

        return answer;
    }
}

// import java.util.*;

// public class Solution {
//     public int solution(int n) {
//         int answer = 0;

//         int length = (int)( Math.log10(n)+1);
//         double num = n;
        
//         for(int i = 1; i <= length; i++){
//             answer += num/(Math.pow(10, length - i));
//             num = num%(Math.pow(10, length - i));
//         }

//         return answer;
//     }
// }
