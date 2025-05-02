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
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(input[j]);
            }

            int dif = 0;
            int reDif = 0;

            for (int j = 0; j < N - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    if (arr[j + 1] - arr[j] > dif) {
                        dif = arr[j + 1] - arr[j];
                    }
                }
                else if (arr[j] > arr[j + 1]) {
                    if (arr[j] - arr[j + 1] > reDif) {
                        reDif = arr[j] - arr[j + 1];
                    }
                }
            }

            System.out.println("#" + i + " " + dif + " " + reDif);
        }
    }
}