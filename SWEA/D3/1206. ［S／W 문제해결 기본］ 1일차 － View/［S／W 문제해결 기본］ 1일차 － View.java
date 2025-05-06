import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());
            int[] building = new int[N];
            String[] input = br.readLine().split(" ");

            int cnt = 0;

            for (int i = 0; i < N; i++) {
                building[i] = Integer.parseInt(input[i]);
            }

            for (int i = 2; i < N - 2; i++) {
                for (int j = 1; j <= building[i]; j++) {
                    if (j > building[i - 2] && j > building[i - 1] && j > building[i + 1] && j > building[i + 2]) {
                        cnt++;
                    }
                }
            }

            System.out.println("#" + t + " " + cnt);
        }
    }
}