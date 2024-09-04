class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int current = n;
        int basket = 0;
        
        while(current >= a){
            basket = (current/a)*b;
            current = current%a + basket;
            answer += basket;
        }
        

        
        return answer;
    }
}