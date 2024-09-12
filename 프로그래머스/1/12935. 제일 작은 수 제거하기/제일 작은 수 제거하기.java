import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int min = arr[0];
        int num = 0;
        
         if (arr.length == 1) {
            return new int[]{-1};
        }
        
        for(int i = 0; i < arr.length; i++){
                min = Math.min(min, arr[i]);  
            }
        
    
        int[] answer = new int[arr.length-1];
        int index = 0;
    
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != min){
                answer[index++] = arr[i];
            }
        }
        return answer;
    }
}