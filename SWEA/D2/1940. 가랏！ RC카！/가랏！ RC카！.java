import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            int v = 0;
            int d = 0;

            for (int i = 0; i < N; i++) {
                String[] input = br.readLine().split(" ");

                int c = Integer.parseInt(input[0]);

                if (c == 0) {
                    d += v;
                }
                else if (c == 1) {
                    int a = Integer.parseInt(input[1]);
                    v += a;
                    d += v;
                }
                else if (c == 2) {
                    int a = Integer.parseInt(input[1]);
                    v -= a;
                    if (v < 0)
                        v = 0;
                    d += v;
                }
            }

            System.out.println("#" + t + " " + d);
        }
    }
}