class Solution {
    public String solution(int n) {
        String answer = "";
        
        String hol = "수";
        String ZZak = "수박";
        
        if(n % 2 == 0){
            for(int i = 0; i < n/2; i++){
                answer += ZZak;
            }
        }
        else{
            for(int i = 0; i < n/2; i++){
                answer += ZZak;
            }
            answer += hol;
        }
        
        
        
        return answer;
    }
}