import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int tmp = 0;
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            if(tmp!=nums[i]){
                tmp = nums[i];
                answer++;
            }
        }
        
        if(answer > (nums.length/2)){
            return nums.length/2;
        }
        
        return answer;
    }
}
