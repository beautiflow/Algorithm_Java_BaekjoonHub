import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        ArrayList<Integer> number = new ArrayList<>();
        
        while (n > 0) {
            number.add((int) (n % 10));
            n = n / 10;
        }
        
        Collections.sort(number, Comparator.reverseOrder());
        
        StringBuilder str = new StringBuilder();
        for (int num : number) {
            str.append(num);
        }
        
        long answer = Long.parseLong(str.toString());
        
        return answer;
    }
}