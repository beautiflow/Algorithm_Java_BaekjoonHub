class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 != 0){
            int tmp = s.length()/2;
            answer = answer + s.charAt(tmp);
        }
        else{
            int tmp = s.length()/2;
            answer = s.charAt(tmp-1) +""+ s.charAt(tmp);
        }
        return answer;
    }
}