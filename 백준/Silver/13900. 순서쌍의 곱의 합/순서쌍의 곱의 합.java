import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] num = new long[N];
        long result = 0;
        long input;

        StringTokenizer st = new StringTokenizer(br.readLine());

        num[0] = Integer.parseInt(st.nextToken());

        for(int i = 1; i < N; i++){
            input = Integer.parseInt(st.nextToken());
            num[i] = input + num[i-1];
            result += num[i-1]*input;
        }

        System.out.println(result);

    }
}