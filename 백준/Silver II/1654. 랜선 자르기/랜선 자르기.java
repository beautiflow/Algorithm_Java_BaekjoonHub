import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 입력 받기
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int num[] = new int[K];

        long min = 1;
        long max = 0;

        // 랜선 길이 받아서 최고 긴 길이 구하기
        for(int i = 0; i < K; i++){
            num[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, num[i]);
        }

        long result = binarySearch(num, N, min, max);

        System.out.println(result);

    }

    public static long binarySearch(int[] num, int N, long min, long max){
        // 랜선 길이
        long result = 0;

        while(min <= max){

            long mid = (min + max) / 2;
            long cnt = 0;

            // 랜선 길이로 나눠서 몇개 나오는지 구하기
            for(int i = 0; i < num.length; i++){
                cnt += num[i] / mid;
            }

            // 랜선 길이가 N보다 크거나 같으면 result에 저장
            if(cnt >= N) {
                result = mid;
                min = mid + 1;
            }
            else{
                max = mid - 1;
            }
        }
        return result;
    }

}