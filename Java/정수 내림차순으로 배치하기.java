import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String result = "";
        
        Integer[] arr = new Integer[Long.toString(n).length()];
        
        for(int i = 0; i < arr.length; i ++){
            arr[i] = (int)(n%10);
            n /= 10;
        }
         
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i = 0; i < arr.length; i ++){
            result += Integer.toString(arr[i]);
        }
        
        answer = Long.parseLong(result);
        
        return answer;
    }
}
