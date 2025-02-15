import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        // 최대공약수 구하기 (유클리드 호제법)
        int gcd = getGCD(A, B);

        // 최소공배수 구하기
        int lcm = (A / gcd) * B;  // (A * B) / gcd에서 오버플로우 방지

        System.out.println(gcd);
        System.out.println(lcm);
    }

    // 최대공약수를 구하는 함수 (유클리드 호제법)
    private static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
