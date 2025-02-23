import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            long GCDSum = 0;
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }

            for (int k = 0; k < N - 1; k++) {
                for (int s = k + 1; s < N; s++) {
                    GCDSum += getGCD(arr[k], arr[s]);
                }
            }

            System.out.println(GCDSum);
        }
    }

    private static long getGCD(int x, int y) {
        while (y != 0) {
            int tmp = y;
            y = x % y;
            x = tmp;
        }
        return x;
    }
}
