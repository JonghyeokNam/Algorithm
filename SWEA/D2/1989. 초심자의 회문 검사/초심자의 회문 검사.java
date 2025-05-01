import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String input = br.readLine();
            boolean pal = true;

            for (int j = 0, k = input.length() - 1; j < input.length() / 2; j++, k--) {
                if (input.charAt(j) != input.charAt(k)) {
                    pal = false;
                    break;
                }
            }

            if (pal) {
                System.out.println("#" + i + " " + 1);
            }
            else {
                System.out.println("#" + i + " " + 0);
            }
        }
    }
}
