import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        StringBuilder sb = new StringBuilder(); // 결과를 저장할 StringBuilder

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 현재 타운의 사람 수

            int[] powers = new int[N];
            long sum = 0; // 총 합계

            for (int i = 0; i < N; i++) {
                powers[i] = Integer.parseInt(st.nextToken());
                sum += powers[i];
            }

            // 평균 계산
            double average = (double) sum / N;

            // 평균보다 높은 사람 수 계산
            int count = 0;
            for (int power : powers) {
                if (power > average) {
                    count++;
                }
            }

            // 퍼센트 계산 및 반올림
            double percent = (count * 100.0) / N;
            percent = Math.round(percent * 1000) / 1000.0; // 반올림 (소수점 셋째 자리)

            // 평균 및 퍼센트 결과를 추가
            sb.append(String.format("%.3f %.3f%%\n", average, percent));
        }

        // 결과 출력
        System.out.print(sb.toString());
    }
}