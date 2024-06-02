import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        
        int num = 0;
        
        if(array.length % 2 == 0){
            num = array.length/2-1;
        }
        else{
            num = array.length/2 ;
        }
        
        answer = array[num];
        
        return answer;
    }
}