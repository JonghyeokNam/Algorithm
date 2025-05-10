import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());

            int[][] matrix = new int[100][100];

            for (int i = 0; i < 100; i++) {
                String[] input = br.readLine().split(" ");
                for (int j = 0; j < 100; j++) {
                    matrix[i][j] = Integer.parseInt(input[j]);
                }
            }

            int max = 0;

            for (int i = 0; i < 100; i++) {
                int sum = 0;
                for (int j = 0; j < 100; j++) {
                    sum += matrix[i][j];
                }
                if (sum > max) {
                    max = sum;
                }
            }

            for (int i = 0; i < 100; i++) {
                int sum = 0;
                for (int j = 0; j < 100; j++) {
                    sum += matrix[j][i];
                }
                if (sum > max) {
                    max = sum;
                }
            }

            int sum = 0;
            for (int i = 0, j = 0; i < 100; i++, j++) {
                sum += matrix[i][j];
            }
            if (sum > max) {
                max = sum;
            }

            sum = 0;
            for (int i = 99, j = 0; j < 100; i--, j++) {
                sum += matrix[i][j];
            }
            if (sum > max) {
                max = sum;
            }

            System.out.println("#" + t + " " + max);
        }
    }
}