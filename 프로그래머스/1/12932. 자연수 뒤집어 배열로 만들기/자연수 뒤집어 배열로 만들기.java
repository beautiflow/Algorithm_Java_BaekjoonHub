class Solution {
    public int[] solution(long n) {
        
        String num = String.valueOf(n);
        
        int[] answer = new int[num.length()];
        
        int cnt = 0;
    
        while(n > 0){
            long number = n%10;
            answer[cnt] = (int)number;
            n/=10;
            cnt++;    
        }
        
        return answer;
    }
}