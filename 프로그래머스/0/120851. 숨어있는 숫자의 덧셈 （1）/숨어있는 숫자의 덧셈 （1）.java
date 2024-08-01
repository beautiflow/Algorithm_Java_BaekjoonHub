class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++){
            char result = my_string.charAt(i);
            
            switch(result){
                case '1':
                    answer += Character.getNumericValue(result);
                    break;
                case '2':
                    answer += Character.getNumericValue(result);
                    break;
                case '3' :
                    answer += Character.getNumericValue(result);
                    break;
                case '4' :
                    answer += Character.getNumericValue(result);
                    break;
                case '5':
                    answer += Character.getNumericValue(result);
                    break;
                case '6': 
                    answer += Character.getNumericValue(result);
                    break;
                case '7':
                    answer += Character.getNumericValue(result);
                    break;
                case '8':
                    answer += Character.getNumericValue(result);
                    break;
                case '9' :
                    answer += Character.getNumericValue(result);
                    break;
                case '0':
                    answer += Character.getNumericValue(result);
                    break;
                default:
                    break;
                        
            }
            
        }
            
        return answer;
    }
}