import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<BigInteger> numbers = new ArrayList<>();
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                char currentChar = str.charAt(j);

                // 문자가 1부터 9인지 확인
                if (Character.isDigit(currentChar)) {
                    num.append(currentChar);
                }
                else if(num.length()>0){
                    numbers.add(new BigInteger(num.toString()));
                    num.setLength(0);
                }
            }
            if (num.length() > 0) {
                numbers.add(new BigInteger(num.toString()));
                num.setLength(0);
            }
        }

        Collections.sort(numbers);

        for (BigInteger answer : numbers) {
            System.out.println(answer);
        }

    }// main
}