import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ns = br.readLine().split(" ");
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(ns[0]);
        int S = Integer.parseInt(ns[1]);

        int[] A = new int[N];
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
            arr[i] = Math.abs(S - A[i]);
        }

        int D = arr[0];
        for (int i = 1; i < N; i++) {
            D = getGCD(D, arr[i]);
        }
        
        System.out.println(D);
    }

    private static int getGCD(int x, int y) {
        while (y != 0) {
            int tmp = y;
            y = x % y;
            x = tmp;
        }
        return x;
    }
}
