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

            int h1 = Integer.parseInt(input[0]);
            int m1 = Integer.parseInt(input[1]);
            int h2 = Integer.parseInt(input[2]);
            int m2 = Integer.parseInt(input[3]);

            int h = h1 + h2;
            int m = m1 + m2;

            if (m >= 60) {
                m -= 60;
                h += 1;
            }

            if (h > 12) {
                h -= 12;
            }

            System.out.println("#" + t + " " + h + " " + m);
        }
    }
}