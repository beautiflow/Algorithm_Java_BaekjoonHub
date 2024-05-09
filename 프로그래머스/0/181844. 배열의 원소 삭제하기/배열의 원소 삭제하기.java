class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    arr[i] = 0;
                }
            } 
        }
        
        int cnt = 0;
         for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                answer[cnt] = arr[i];
                cnt++;
            }   
        }
        
        int[] trueAnswer = new int[cnt];
        for(int i = 0; i < cnt; i++){
            trueAnswer[i] = answer[i];
        }
  
        return trueAnswer;
    }
}