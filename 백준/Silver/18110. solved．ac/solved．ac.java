import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 절사평균 구하기 : 총 몇 명 제외할 것인지
        float M = (float) Math.round(N * 0.15);
        int m = (int) Math.round(M);

        // 의견 저장 배열
        int[] opinion = new int[N];

        // 의견 받기
        for(int i = 0; i < N; i++){
            opinion[i] = Integer.parseInt(br.readLine());
        }

        // 의견 정렬
        Arrays.sort(opinion);

        // 의견 합 구하기
        int sum = 0;
        for(int i = m; i < opinion.length-m; i++){
            sum += opinion[i];
        }

        // 평균 구하기
        float avg = (float) sum / (opinion.length-(m*2));
        int answer = (int) Math.round(avg);

        System.out.print(answer);
    }
}