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
            Arrays.sort(arr);

            System.out.print("#" + i + " ");
            for (int j = 0; j < N; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}