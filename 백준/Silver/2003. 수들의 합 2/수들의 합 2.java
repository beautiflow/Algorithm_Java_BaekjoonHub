import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int num;
        int count = 0;

        String[] numbers = br.readLine().split(" ");

        for(int tc = 0; tc < N; tc++) {
            num = 0;
            for (int i = tc; i < N; i++) {
                num += Integer.parseInt(String.valueOf(numbers[i]));
                if (num == M) {
                    count++;
                } else if (num > M) {
                    break;
                }
            } // for2
        } // for1
        System.out.println(count);
    } // main
}