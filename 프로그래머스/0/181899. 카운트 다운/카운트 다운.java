class Solution {
    public int[] solution(int start_num, int end_num) {
        int num = start_num-end_num+1;
        int[] answer = new int[num];
        int arr = start_num;

        
        for(int i = 0; i < start_num-end_num+1; i++){
            answer[i] = arr--;
        }
        return answer;
    }
}