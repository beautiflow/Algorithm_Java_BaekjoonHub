class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int sum1 = intervals[0][1]-intervals[0][0]+1;
        int sum2 = intervals[1][1]-intervals[1][0]+1;
        
        int result = sum1+sum2;
        
        int[] answer = new int[result];
        
        int num = 0;
        
        for(int i = intervals[0][0]; i <= intervals[0][1]; i++){
            answer[num++] = arr[i];
        }
        
        for(int i = intervals[1][0]; i <= intervals[1][1]; i++){
            answer[num++] = arr[i];
        }
        
        
        return answer;
    }
}