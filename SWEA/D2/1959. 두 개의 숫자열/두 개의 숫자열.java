import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);

            int[] A = new int[N];
            int[] B = new int[M];

            String[] strA = br.readLine().split(" ");
            String[] strB = br.readLine().split(" ");

            for (int j = 0; j < N; j++) {
                A[j] = Integer.parseInt(strA[j]);
            }
            for (int j = 0; j < M; j++) {
                B[j] = Integer.parseInt(strB[j]);
            }

            int sumMax = 0;

            if (N >= M) {
                for (int j = 0; j <= N - M; j++) {
                    int sumTmp = 0;
                    for (int k = 0; k < M; k++) {
                        sumTmp += A[k + j] * B[k];
                    }
                    if (sumTmp > sumMax)
                        sumMax = sumTmp;
                }
            }
            else if (N < M) {
                for (int j = 0; j <= M - N; j++) {
                    int sumTmp = 0;
                    for (int k = 0; k < N; k++) {
                        sumTmp += A[k] * B[k + j];
                    }
                    if (sumTmp > sumMax)
                        sumMax = sumTmp;
                }
            }

            System.out.println("#" + i + " " + sumMax);
        }
    }
}
