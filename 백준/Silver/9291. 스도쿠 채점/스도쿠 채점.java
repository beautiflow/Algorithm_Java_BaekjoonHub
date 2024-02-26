import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int start = 0;

        for(int tc = 1; tc <= T; tc++){
            int[][] sudoku = new int[9][9];

            for(int i = 0; i < 9; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < 9; j++){
                    sudoku[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            if(rowCheck(sudoku) && colCheck(sudoku) && squareCheck(sudoku)){
                System.out.println("Case " + (++start) + ": CORRECT");
            }
            else {
                System.out.println("Case " + (++start) + ": INCORRECT");
            }

            if(T > tc){
                br.readLine();
            }
        } // for tc
    } // main


    private static boolean rowCheck(int[][] sudoku) {

        for (int i = 0; i < 9; i++) {
            boolean[] visited = new boolean[10]; // 1부터 9까지의 숫자 방문 여부를 저장하는 배열
            for (int j = 0; j < 9; j++) {
                int num = sudoku[i][j];
                if (visited[num]) {
                    return false; // 이미 방문한 숫자가 나타날 경우
                }
                visited[num] = true;
            }
        }
        return true;
    }// rowCheck

    private static boolean colCheck(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            boolean[] visited = new boolean[10];
            for (int j = 0; j < 9; j++) {
                int num = sudoku[j][i];
                if (visited[num]) {
                    return false; // 이미 방문한 숫자가 나타날 경우
                }
                visited[num] = true;
            }
        }
        return true;
    } // colCheck

    private static boolean squareCheck(int[][] sudoku) {
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                boolean[] visited = new boolean[10];
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        int num = sudoku[i][j];
                        if (visited[num]) {
                            return false; // 이미 방문한 숫자가 나타날 경우
                        }
                        visited[num] = true;
                    }
                }
            }
        }
        return true;
    } // squareCheck

}