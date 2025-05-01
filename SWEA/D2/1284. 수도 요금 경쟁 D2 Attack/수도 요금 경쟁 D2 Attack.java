import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String[] input = br.readLine().split(" ");

            int P = Integer.parseInt(input[0]);
            int Q = Integer.parseInt(input[1]);
            int R = Integer.parseInt(input[2]);
            int S = Integer.parseInt(input[3]);
            int W = Integer.parseInt(input[4]);

            int A = P * W;
            int B;

            if (W <= R) {
                B = Q;
            }
            else {
                B = Q + (W - R) * S;
            }

            if (A < B) {
                System.out.println("#" + i + " " + A);
            }
            else {
                System.out.println("#" + i + " " + B);
            }
        }
    }
}
