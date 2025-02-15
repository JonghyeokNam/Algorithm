import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        String[] input = br.readLine().split(" ");
        int count = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
            int tmpCount = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    tmpCount++;
                }
            }
            if (tmpCount == 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
