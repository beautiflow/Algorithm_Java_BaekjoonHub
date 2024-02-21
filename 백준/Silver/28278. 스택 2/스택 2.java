import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        // 명령 개수 입력받기
        int N = Integer.parseInt(br.readLine());

        String command;

        // for 문 돌면서 명령 수행하기
        for (int i = 0; i < N; i++) {
            command = br.readLine().trim();
            String[] token = command.split(" ");

            int order = Integer.parseInt(token[0]);

            switch (order) {
                case 1:
                    int num = Integer.parseInt(token[1]);
                    stack.push(num);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        int pop = stack.pop();
                        sb.append(pop+ "\n");
                    } else {
                        sb.append(-1 + "\n");
                    }
                    break;
                case 3:
                    sb.append(stack.size() + "\n");
                break;
                case 4:
                    if (stack.isEmpty()) {
                        sb.append(1+ "\n");
                    } else {
                        sb.append(0+ "\n");
                    }
                    break;
                case 5:
                    if (!stack.isEmpty()) {
                        sb.append(stack.peek()+ "\n");
                    } else {
                        sb.append(-1+ "\n");
                    }
                    break;
            } // switch
        }// for
        
        System.out.println(sb);
    }// main

}