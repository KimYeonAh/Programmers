import java.util.*;
import java.io.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long ran = t.length() - p.length()+1;
        System.out.println(p.charAt(0)-'0');
        for (int i = 0; i < ran; i++){
            long num = t.charAt(i) - '0';
            if( num > (p.charAt(0)-'0')) continue;
            if( Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)){
                answer++;
            }               
        }
        return answer;
    }
}
