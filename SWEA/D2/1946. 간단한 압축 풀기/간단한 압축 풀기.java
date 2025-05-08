import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            StringBuilder str = new StringBuilder();

            int sum = 0;

            for (int i = 0; i < N; i++) {
                String[] input = br.readLine().split(" ");
                char ch = input[0].charAt(0);
                int n = Integer.parseInt(input[1]);
                sum += n;

                for (int j = 0; j < n; j++) {
                    str.append(ch);
                }
            }

            System.out.println("#" + t);

            for (int i = 0; i < sum; i++) {
                if (i >= 1 && i % 10 == 0) {
                    System.out.println();
                }
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }
    }
}