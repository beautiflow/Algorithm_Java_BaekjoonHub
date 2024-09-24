class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        int bigNum = 0;
        int index = 0;
        
        for(int i = 0; i < array.length; i++){
            if(bigNum < array[i]){
                bigNum = array[i];
                index = i;
            }
        }
        
        answer[0] = bigNum;
        answer[1] = index;
        
        
        return answer;
    }
}