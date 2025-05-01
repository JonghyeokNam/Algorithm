import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String[] input = br.readLine().split(" ");

            int L = Integer.parseInt(input[0]);
            int U = Integer.parseInt(input[1]);
            int X = Integer.parseInt(input[2]);

            if (X > U) {
                System.out.println("#" + i + " " + -1);
            }
            else if (X >= L && X <= U) {
                System.out.println("#" + i + " " + 0);
            }
            else {
                System.out.println("#" + i + " " + (L - X));
            }
        }
    }
}
