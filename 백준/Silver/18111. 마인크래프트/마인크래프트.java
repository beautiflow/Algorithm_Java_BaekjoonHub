import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 세로
        int M = Integer.parseInt(st.nextToken()); // 가로
        int B = Integer.parseInt(st.nextToken()); // 인벤토리

        // 땅 배열 생성
        int[][] ground = new int[N][M];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int time = 64000000;
        int maxHeight = 0;

        // 높이 입력받기
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                // 높이 입력
                ground[i][j] = Integer.parseInt(st.nextToken());
                // 최대 높이 찾기
                max = Math.max(max, ground[i][j]);
                // 최소 높이 찾기
                min = Math.min(min, ground[i][j]);
            }
        }

        // 최소 높이부터 최대 높이까지 돌면서 확인하기
        for(int now = min; now <= max; now++){
            int second = 0;
            int block = B;
                for(int i = 0; i < N; i++){
                    for(int j = 0; j < M; j++){
                        // 1번 : 좌표 (i, j)의 가장 위에 있는 블록을 제거하여 인벤토리에 넣는다. -> 2초
                        if(now < ground[i][j]){
                            second += ((ground[i][j] - now)*2);
                            block += (ground[i][j] - now);
                        }
                        // 2번 : 인벤토리에서 블록 하나를 꺼내어 좌표 (i, j)의 가장 위에 있는 블록 위에 놓는다. -> 1초
                        else {
                            second += (now - ground[i][j]);
                            block -= (now - ground[i][j]);
                        }
                    }
                }
            // block 이 0보다 작으면 반복문 멈추기
            if(block < 0){
                break;
            }

            if(time >= second){
                time = second;
                maxHeight = now;
            }
        }
        // 결과 출력
        System.out.println(time + " " + maxHeight);

    } // main
}