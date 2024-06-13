class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int yNum = 0;
        int pNum = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                yNum++;
            }
            else if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                pNum++;
            }
        }
        
        if(yNum == pNum){
            answer = true;
        }
        else if(yNum != pNum){
            answer = false;
        }
        else if(yNum == 0 && pNum == 0){
            answer = true;
        }

        return answer;
    }
}