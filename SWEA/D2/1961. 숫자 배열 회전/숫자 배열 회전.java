import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            int[][] matrix = new int[N][N];

            for (int i = 0; i < N; i++) {
                String[] input = br.readLine().split(" ");

                for (int j = 0; j < N; j++) {
                    matrix[i][j] = Integer.parseInt(input[j]);
                }
            }

            int[][] mat90 = new int[N][N];
            int[][] mat180 = new int[N][N];
            int[][] mat270 = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    mat90[i][j] = matrix[N - (j + 1)][i];
                    mat180[i][j] = matrix[N - (i + 1)][N - (j + 1)];
                    mat270[i][j] = matrix[j][N - (i + 1)];
                }
            }

            System.out.println("#" + t);

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(mat90[i][j]);
                }
                System.out.print(" ");
                for (int j = 0; j < N; j++) {
                    System.out.print(mat180[i][j]);
                }
                System.out.print(" ");
                for (int j = 0; j < N; j++) {
                    System.out.print(mat270[i][j]);
                }
                System.out.println();
            }
        }
    }
}