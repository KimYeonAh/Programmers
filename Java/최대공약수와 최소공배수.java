class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        int tmp = 0;
        
        //최대공약수
        while(min != 0){
            tmp = max % min;
            max = min;
            min = tmp;
        }
        answer[0] = max;
        
        //최소공배수
        answer[1] = n * m / answer[0];
        
        return answer;
    }
}
