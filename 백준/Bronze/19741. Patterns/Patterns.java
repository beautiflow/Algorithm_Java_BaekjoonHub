import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] num = new int[N*N+1];

        for(int i = 1; i <= N*N; i++){
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    num[i]++;
                    if (j != i / j) {
                        num[i]++;
                    }
                }
            }
        }

        for(int i = 1; i <= N*N; i++){
            if(num[i] <= K){
                bw.write("*");
            }
            else {
                bw.write(".");
            }
            if (i % N == 0){
                bw.write("\n");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}