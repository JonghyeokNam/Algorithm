import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            if (A >= 1 && A <= 9 && B >= 1 && B <= 9) {
                System.out.println("#" + t + " " + A * B);
            }
            else {
                System.out.println("#" + t + " " + -1);
            }
        }
    }
}