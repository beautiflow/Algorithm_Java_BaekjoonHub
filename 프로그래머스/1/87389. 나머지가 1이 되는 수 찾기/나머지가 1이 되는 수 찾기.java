import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 1; i <= n; i++){
            if(n%i == 1){
                min = Math.min(min, i);
            }
        }
        
        answer = min;
        
        return answer;
    }
}