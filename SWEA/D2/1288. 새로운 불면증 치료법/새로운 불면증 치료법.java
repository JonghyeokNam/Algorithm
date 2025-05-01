import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int[] number = new int[10];
            int count = 1;
            int N = Integer.parseInt(br.readLine());
            int origin = N;

            while(true) {
                int current = origin * count;
                int tmpN = current;

                while(tmpN > 0) {
                    number[tmpN % 10] = 1;
                    tmpN /= 10;
                }

                boolean allseen = true;
                for (int j = 0; j < 10; j++) {
                    if (number[j] == 0) {
                        allseen = false;
                        break;
                    }
                }

                if (allseen) {
                    System.out.println("#" + i + " " + current);
                    break;
                }

                count++;
            }
        }
    }
}
