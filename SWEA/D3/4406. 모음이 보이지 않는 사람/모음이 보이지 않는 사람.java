import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String input = br.readLine();

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    result.append(ch);
                }
            }

            System.out.println("#" + t + " " + result);
        }
    }
}