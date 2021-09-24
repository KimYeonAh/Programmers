class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < arr1.length; i++){
            answer[i] = bitNum(n, arr1[i], arr2[i]);
        }
        
        return answer;
    }
    
    public String bitNum(int n, int arr1, int arr2){
        String result = "";
        
        for(int i = 0; i < n; i++){
            if(arr1 % 2 == 1 || arr2 % 2 == 1){
                result += "#";
            }else{
                result += " ";
            }
            arr1 /= 2;
            arr2 /= 2;
        }

        return ( new StringBuffer(result) ).reverse().toString();
    }
}
