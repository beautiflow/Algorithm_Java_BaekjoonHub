import java.util.*;


class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        
        if(list.size() == 0){
            int zeroAnswer[] = {-1};
            return zeroAnswer;
        }
        
        Collections.sort(list);
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}