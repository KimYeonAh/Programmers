class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int length = Integer.toString(x).length();
        int num = 0;
        int tmp = x;
        
        for(int i = 0; i < length; i ++){
            num += (x % 10);
            x /= 10;
        }
        
        if(tmp % num != 0){ answer = false; }
        
        return answer;
    }
}
