import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<String>();

        int count = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            // "ENTER" 면 size 추가 및 초기화
            if (str.equals("ENTER")) {
                count += set.size();
                set.clear();
            // 그렇지 않으면 set 에 추가
            } else {
                set.add(str);
            }
        }
        // set 안에 남아 있는 원소 개수 세기
        if (set.size() > 0) {
            count += set.size();
        }
        // 결과 출력
        System.out.println(count);
    }
}