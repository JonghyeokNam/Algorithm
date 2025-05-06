import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            int N = Integer.parseInt(input[2]);

            int cnt = 0;

            while(true) {
                if (A >= B) {
                    B += A;
                    cnt++;
                    if (B > N) {
                        break;
                    }
                }
                else if (B > A) {
                    A += B;
                    cnt++;
                    if (A > N) {
                        break;
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}