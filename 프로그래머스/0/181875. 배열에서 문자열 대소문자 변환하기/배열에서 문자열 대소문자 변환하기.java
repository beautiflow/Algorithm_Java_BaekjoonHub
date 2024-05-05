class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for(int i = 0; i < strArr.length; i++){
            if(i%2== 0){
                String str = strArr[i];
                answer[i] = str.toLowerCase();
            }
            else{
                String str = strArr[i];
                answer[i] = str.toUpperCase();
            }
        }
        return answer;
    }
}