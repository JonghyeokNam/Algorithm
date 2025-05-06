import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());

            int[][] table = new int[N][N];

            for (int i = 0; i < N; i++) {
                String[] input = br.readLine().split(" ");
                for (int j = 0; j < N; j++) {
                    table[i][j] = Integer.parseInt(input[j]);
                }
            }
            
            int cnt = 0;
            
            for (int i = 0; i < N; i++) {
                int check = 0;
                for (int j = 0; j < N; j++) {
                    if (table[j][i] == 1) {
                        check = 1;
                    }
                    if (check == 1 && table[j][i] == 2) {
                        cnt++;
                        check = 0;
                    }
                }
            }

            System.out.println("#" + t + " " + cnt);
        }
    }
}