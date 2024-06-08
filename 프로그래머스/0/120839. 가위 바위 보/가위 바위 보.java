class Solution {
    public String solution(String rsp) {
        String answer = "";
                
        String[] box = new String[rsp.length()];
        
        for(int i = 0; i < box.length; i++){
            
            String curChar = String.valueOf(rsp.charAt(i));
            
            if(curChar.equals("2")){
                answer += "0";
            }
            else if(curChar.equals("0")){
                answer += "5";
            }
            else if(curChar.equals("5")){
                answer += "2";
            }
        }
        
        return answer;
    }
}