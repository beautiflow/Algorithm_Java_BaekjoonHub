import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int tc = 0; tc < T; tc++){

            int N = Integer.parseInt(br.readLine());
            int min = Integer.MAX_VALUE;

            String[] mbti = new String[N];
            st = new StringTokenizer(br.readLine(), " ");
            
            // N 이 32보다 크면 겹치는 mbti 무조건 3명이라 심리적 거리감 => 0 : 32 이하만 검색하기
            if(N <= 32){
                for(int i = 0; i < N; i++){
                    mbti[i] = st.nextToken();
                }

                for(int i = 0; i < N; i++){
                    for(int j = i+1; j < N; j++){
                        for(int k = j+1; k < N; k++){
                            int count = 0;
                            // mbti 돌면서 다르면 증가
                            for(int m = 0 ; m < 4; m++){
                                if(mbti[i].charAt(m) != mbti[j].charAt(m)){
                                    count += 1;
                                }
                                if(mbti[i].charAt(m) != mbti[k].charAt(m)){
                                    count += 1;
                                }
                                if(mbti[j].charAt(m) != mbti[k].charAt(m)){
                                    count += 1;
                                }
                            } // for -> m
                            min = Math.min(count, min);
                        } // for -> k
                    } // for -> j
                } // for -> i
                
                // 결과 출력
                System.out.println(min);
            } // if(N <= 32)
            else {
                System.out.println(0);
            }
        } // tc
    } // main
}