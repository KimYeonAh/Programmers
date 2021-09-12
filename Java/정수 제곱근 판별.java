class Solution {
    public long solution(long n) {
        if(Math.pow((int)Math.sqrt(n), 2) == n){
            return (long) Math.pow((int)Math.sqrt(n)+1, 2);
        }
        
        return -1;
    }
}

// class Solution {
//     public long solution(long n) {
//         long answer = 0;
//         double sqrt = Math.sqrt(n);        
//         int num = (int) sqrt;
//         double primeNum = sqrt - num;

//         if(primeNum!=0){
//             answer = -1;
//         }else{
//             num += 1;
//             answer = (long)Math.pow(num, 2);
//         }

//         return answer;
//     }
// }
