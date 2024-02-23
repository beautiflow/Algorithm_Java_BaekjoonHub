import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");

            String person1 = st.nextToken();
            String person2 = st.nextToken();

            // 총총이랑 만났을 경우
            if(person1.equals("ChongChong") || person2.equals("ChongChong")){
                set.add(person1);
                set.add(person2);
            }
            // 총총이랑 만났던 집합의 사람과 만났을 경우
            if(set.contains(person1.toString()) || set.contains(person2.toString())){
                set.add(person1);
                set.add(person2);
            }
        } // for 1

        // 결과 출력
        System.out.println(set.size());
    } // main
}