import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 1; t <= 10; t++) {
            int T = Integer.parseInt(br.readLine());

            String str1 = br.readLine();
            String str2 = br.readLine();

            int cnt = 0;

            for (int i = 0; i <= str2.length() - str1.length(); i++) {
                int tmpCnt = 0;
                if (str2.charAt(i) == str1.charAt(0)) {
                    for (int j = 0, k = i; j < str1.length() ; j++, k++) {
                        if (str2.charAt(k) == str1.charAt(j)) {
                            tmpCnt++;
                        }
                    }
                    if (tmpCnt == str1.length()) {
                        cnt++;
                    }
                }
            }

            System.out.println("#" + t + " " + cnt);
        }
    }
}