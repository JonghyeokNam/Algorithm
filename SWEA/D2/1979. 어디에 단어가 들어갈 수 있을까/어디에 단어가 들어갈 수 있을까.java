import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int K = Integer.parseInt(input[1]);

            int[][] puzzle = new int[N][N];
            for (int i = 0; i < N; i++) {
                String[] row = br.readLine().split(" ");
                for (int j = 0; j < N; j++) {
                    puzzle[i][j] = Integer.parseInt(row[j]);
                }
            }

            int count = 0;

            for (int i = 0; i < N; i++) {
                int len = 0;
                for (int j = 0; j < N; j++) {
                    if (puzzle[i][j] == 1) {
                        len++;
                    } else {
                        if (len == K) count++;
                        len = 0;
                    }
                }
                if (len == K) count++;
            }

            for (int j = 0; j < N; j++) {
                int len = 0;
                for (int i = 0; i < N; i++) {
                    if (puzzle[i][j] == 1) {
                        len++;
                    } else {
                        if (len == K) count++;
                        len = 0;
                    }
                }
                if (len == K) count++;
            }

            System.out.println("#" + t + " " + count);
        }
    }
}
