import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        int[] P = new int[N + 1];

        String[] input = br.readLine().split(" ");
        for (int i = 1; i <= N; i++) {
            dp[i] = Integer.MAX_VALUE;
            P[i] = Integer.parseInt(input[i - 1]);
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j] + P[j]);
            }
        }
        System.out.println(dp[N]);
    }
}
