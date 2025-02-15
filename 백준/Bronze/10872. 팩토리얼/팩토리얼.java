import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        getFac(N);
    }

    public static void getFac(int N) {
        if (N == 0)
            System.out.println(1);
        else {
            int Fac = 1;
            for (int i = 1; i <= N; i++) {
                Fac *= i;
            }
            System.out.println(Fac);
        }
    }
}
