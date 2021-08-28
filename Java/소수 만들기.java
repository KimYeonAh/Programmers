class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = 0;

        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    answer = nums[i] + nums[j] + nums[k];
                    if(answer%2!=0){
                        if(sosu(answer)==true){
                            count++;
                        }
                    }            
                }
            }
        }
        return count;
    }
    
    public boolean sosu(int num){

        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
