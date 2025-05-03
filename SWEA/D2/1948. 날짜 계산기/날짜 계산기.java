import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String[] input = br.readLine().split(" ");

            int firstM = Integer.parseInt(input[0]);
            int firstD = Integer.parseInt(input[1]);
            int secM = Integer.parseInt(input[2]);
            int secD = Integer.parseInt(input[3]);

            int dif = 0;

            if (secM > firstM) {
                for (int i = firstM; i < secM; i++) {
                    if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                        dif += 31;
                    }
                    else if (i == 2)
                        dif += 28;
                    else if (i == 4 || i == 6 || i == 9 || i == 11) {
                        dif += 30;
                    }
                }
            }

            dif += (secD - firstD) + 1;

            System.out.println("#" + t + " " + dif);
        }
    }
}