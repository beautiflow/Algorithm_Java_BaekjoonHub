class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int i = 1;
        
        while(n >= k * i){
            answer[i-1] = k * i;
            i++;
        }
        
        return answer;
    }
}