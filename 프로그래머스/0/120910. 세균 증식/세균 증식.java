class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        
        int num = n;
        
        for(int i = 1; i<=t; i++){
            num *= 2;
        }
        answer = num;
        
        
        return answer;
    }
    
    
}