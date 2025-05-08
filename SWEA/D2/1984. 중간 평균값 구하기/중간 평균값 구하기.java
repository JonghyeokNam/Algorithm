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

            int[] arr = new int[10];

            int min = 10001;
            int max = -1;

            for (int i = 0; i < 10; i++) {
                arr[i] = Integer.parseInt(input[i]);
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            int sum = 0;
            int avg;
            int cnt = 0;

            Arrays.sort(arr);

            for (int i = 1; i < 9; i++) {
                sum += arr[i];
            }

            avg = (int) Math.round(sum / 8.0);

            System.out.println("#" + t + " " + avg);
        }
    }
}