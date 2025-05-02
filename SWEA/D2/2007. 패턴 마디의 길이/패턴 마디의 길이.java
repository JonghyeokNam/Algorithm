import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String input = br.readLine();

            char ch = input.charAt(0);
            int cnt = 1;

            for (int j = 1; j < 30; j++) {
                if (ch == input.charAt(j)) {
                    Boolean isRepeat = true;
                    for (int k = 0; k < j; k++) {
                        if (input.charAt(k) != input.charAt(k + j)) {
                            isRepeat = false;
                            break;
                        }
                    }
                    if (isRepeat) {
                        cnt = j;
                        break;
                    }
                }
            }
            System.out.println("#" + i + " " + cnt);
        }
    }
}