import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            Boolean isThree = false;
            int n = t;
            while(true) {
                if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
                    System.out.print("-");
                    isThree = true;
                }
                n /= 10;
                if (isThree && n == 0) {
                    System.out.print(" ");
                    break;
                }
                if (!isThree && n == 0) {
                    break;
                }
            }

            if (!isThree) {
                System.out.print(t + " ");
            }
        }
    }
}