import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            String[] input = br.readLine().split(" ");
            int sum = 0;
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(input[j]);
                sum += arr[j];
            }

            int avg = sum / N;
            int cnt = 0;

            for (int j = 0; j < N; j++) {
                 if (arr[j] <= avg)
                     cnt++;
            }

            System.out.println("#" + i + " " + cnt);
        }
    }
}