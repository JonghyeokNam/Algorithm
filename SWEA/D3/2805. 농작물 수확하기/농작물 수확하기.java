import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            int[][] farm = new int[N][N];

            for (int i = 0; i < N; i++) {
                String input = br.readLine();
                for (int j = 0; j < N; j++) {
                    farm[i][j] = input.charAt(j) - '0';
                }
            }

            int profit = 0;

            for (int i = N / 2; i >= 0; i--) {
                int d = N / 2 - i; // 행이 가운데에서 얼마나 떨어졌는지
                for (int j = d; j < N - d; j++) {
                    profit += farm[i][j];
                }
            }
            for (int i = N / 2 + 1; i < N; i++) {
                int d = i - N / 2; // 행이 가운데에서 얼마나 떨어졌는지
                for (int j = d; j < N - d; j++) {
                    profit += farm[i][j];
                }
            }

            System.out.println("#" + t + " " + profit);
        }
    }
}