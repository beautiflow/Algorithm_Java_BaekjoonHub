import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int[][] fibo = new int[41][2];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] print = fibonacci(N);
            System.out.println(print[0]+ " " + print[1]);
        }
    }

    public static int[] fibonacci(int n){
        fibo[0][0] = 1;
        fibo[0][1] = 0;
        fibo[1][0] = 0;
        fibo[1][1] = 1;

        for(int i = 2; i < 41; i++){
            fibo[i][0] = fibo[i-1][0] + fibo[i-2][0];
            fibo[i][1] = fibo[i-1][1] + fibo[i-2][1];
        }
        return fibo[n];
    }
}