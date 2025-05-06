import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            int cnt50000 = 0;
            int cnt10000 = 0;
            int cnt5000 = 0;
            int cnt1000 = 0;
            int cnt500 = 0;
            int cnt100 = 0;
            int cnt50 = 0;
            int cnt10 = 0;

            if (N / 50000 != 0) {
                cnt50000 += N / 50000;
                N %= 50000;
            }
            if (N / 10000 != 0) {
                cnt10000 += N / 10000;
                N %= 10000;
            }
            if (N / 5000 != 0) {
                cnt5000 += N / 5000;
                N %= 5000;
            }
            if (N >= 1000) {
                cnt1000 += N / 1000;
                N %= 1000;
            }
            if (N >= 500) {
                cnt500 += N / 500;
                N %= 500;
            }
            if (N >= 100) {
                cnt100 += N / 100;
                N %= 100;
            }
            if (N >= 50) {
                cnt50 += N / 50;
                N %= 50;
            }
            if (N >= 10) {
                cnt10 += N / 10;
                N %= 10;
            }

            System.out.println("#" + t);
            System.out.print(cnt50000 + " " + cnt10000 + " " + cnt5000 + " " + cnt1000 + " " + cnt500 + " " + cnt100 + " " + cnt50 + " " + cnt10);
            System.out.println();
        }
    }
}