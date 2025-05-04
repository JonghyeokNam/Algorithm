import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.MarshalException;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String[] input = br.readLine().split(" ");

            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);

            int[][] matrix = new int[N][N];

            for (int i = 0; i < N; i++) {
                String[] str = br.readLine().split(" ");

                for (int j = 0; j < N; j++) {
                    matrix[i][j] = Integer.parseInt(str[j]);
                }
            }

            int max = 0;

            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {
                    int sum = 0;
                    for (int k = 0; k < M; k++) {
                        for (int l = 0; l < M; l++) {
                            sum +=  matrix[i + k][j + l];
                        }
                    }
                    if (sum > max) {
                        max = sum;
                    }
                }
            }

            System.out.println("#" + t + " " + max);
        }
    }
}