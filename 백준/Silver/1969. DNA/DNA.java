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

        String[] DNA = new String[N];

        for(int i = 0; i < N; i++){
            DNA[i] = br.readLine();
        }

        StringBuilder minDNA = new StringBuilder();
        int sumHD = 0;

        // 이중 for 문 돌면서 세로 줄마다 가장 많이 나온 문자 검색하기
        for(int i = 0; i < M; i++){
            int[] ACGT = new int[4];
            for(int j = 0; j < N; j++){
                switch (DNA[j].charAt(i)){
                    case 'A' :
                        ACGT[0]++;
                        break;
                    case 'C' :
                        ACGT[1]++;
                        break;
                    case 'G' :
                        ACGT[2]++;
                        break;
                    case 'T' :
                        ACGT[3]++;
                        break;
                }
            } // for 2

            int max = Math.max(ACGT[0] > ACGT[1] ? ACGT[0] : ACGT[1] , ACGT[2] > ACGT[3] ? ACGT[2] : ACGT[3]);
            sumHD += N-max;

            // 가장 많이 등장한 문자를 결과에 추가
            if(max == ACGT[0])
                minDNA.append("A");
            else if(max == ACGT[1])
                minDNA.append("C");
            else if(max == ACGT[2])
                minDNA.append("G");
            else
                minDNA.append("T");

        } // for 1

        System.out.println(minDNA);
        System.out.println(sumHD);


    } // main

}