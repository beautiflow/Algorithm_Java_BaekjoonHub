import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long totalNum = Long.parseLong(br.readLine()); 
        long init = 1;
        long result = 0;

        while (true){
            result += init;
            if(totalNum<result){
                break;
            }
            init++;
        }
        System.out.println(init-1);
    }
}