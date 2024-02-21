import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 입력 받기
        int T = Integer.parseInt(br.readLine());

        for(int tc = 0; tc < T; tc++){
            // N 값 입력 받기
            int N = Integer.parseInt(br.readLine());

            // 함수 계산
            long length = P(N);

            System.out.println(length);
        }
    } // main

    private static long P(int n) {
        if (n <= 3) {
            return 1;
        }
        
        // 계산하고 저장할 배열 생성
        long[] arr = new long[n+1];

        arr[1] = arr[2] = arr[3] = 1;

        for(int i = 4; i <= n; i++){
            arr[i] = arr[i-2]+arr[i-3];
        }
        return arr[n];
    }
}