class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")){
            int idx = 0;
            for(int i = 1; i < numbers.length; i++){
                answer[i] = numbers[idx++];
            }
            answer[0] = numbers[numbers.length-1];
        }
        else{
            int idx = 1;
            for(int i = 0; i < numbers.length-1; i++){
                answer[i] = numbers[idx++];
            }
            answer[numbers.length-1] = numbers[0];
            
        }
        
        return answer;
    }
}