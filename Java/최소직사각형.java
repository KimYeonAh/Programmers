class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w = Math.max(sizes[0][0], sizes[0][1]);
        int h = Math.min(sizes[0][0], sizes[0][1]);
        
        for(int i = 1; i < sizes.length; i++){
            if(w < Math.max(sizes[i][0], sizes[i][1])){
                w = Math.max(sizes[i][0], sizes[i][1]);
            }
            if(h < Math.min(sizes[i][0], sizes[i][1])){
                h = Math.min(sizes[i][0], sizes[i][1]);
            }
        }
        
        answer = w * h;
        
        return answer;
    }
}
