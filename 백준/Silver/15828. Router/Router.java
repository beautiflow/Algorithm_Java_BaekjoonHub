import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 버퍼 크기 입력받기
        int N = Integer.parseInt(br.readLine());
        
        Queue<Integer> queue = new LinkedList<>();

        while (true) {
            int num = Integer.parseInt(br.readLine());
            // 0보다 크고 버퍼의 크기를 넣어가지 않을 때 추가
            if (num > 0 && queue.size() < N) {
                queue.add(num);
            }
            // 0 이면서 큐가 비어있지 않으면 빼기
            if (num == 0 && !queue.isEmpty()) {
                queue.poll();
            }
            // -1 이면 종료
            if (num == -1) {
                break;
            }
        } // while

        // 큐가 비어있지 않다면
        if (!queue.isEmpty()) {
            // 큐가 비어있을 때 까지 빼기
            while (!queue.isEmpty()) {
                // 결과 출력
                System.out.println(queue.poll());
            }
        }
        // 비어있다면 empty 출력
        else {
            System.out.println("empty");
        }
    }
}