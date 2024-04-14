class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        double multi = 0;
        
        
        for(int i = 0; i < numbers.length; i++){
             multi = numbers[i];
             sum += multi;
        }
        answer = sum/numbers.length;

        return answer;
    }
}