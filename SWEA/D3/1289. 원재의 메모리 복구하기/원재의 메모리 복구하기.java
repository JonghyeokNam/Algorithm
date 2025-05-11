import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String target = br.readLine();
            int cnt = 0;

            char prev = '0'; 
            for (int i = 0; i < target.length(); i++) {
                if (target.charAt(i) != prev) {
                    cnt++;
                    prev = target.charAt(i);
                }
            }

            System.out.println("#" + t + " " + cnt);
        }
    }
}
