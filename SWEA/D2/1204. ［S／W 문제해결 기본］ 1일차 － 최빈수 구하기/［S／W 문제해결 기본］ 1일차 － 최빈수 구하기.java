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

            int cnt[] = new int[101];
            int score[] = new int[1000];

            String[] input = br.readLine().split(" ");
            for (int i = 0; i < 1000; i++) {
                score[i] = Integer.parseInt(input[i]);
                cnt[score[i]]++;
            }

            int max = 0;
            int maxScore = 0;
            for (int i = 0; i < 101; i++) {
                if (cnt[i] >= max) {
                    max = cnt[i];
                    maxScore = i;
                }
            }
            
            System.out.println("#" + t + " " + maxScore);
        }
    }
}