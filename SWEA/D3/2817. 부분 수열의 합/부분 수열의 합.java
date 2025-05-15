import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int N, K, cnt;
    static int[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String[] nk = br.readLine().split(" ");
            N = Integer.parseInt(nk[0]);
            K = Integer.parseInt(nk[1]);

            A = new int[N];
            String[] input = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(input[i]);
            }

            cnt = 0;
            dfs(0, 0, 0);  // DFS 시작

            System.out.println("#" + t + " " + cnt);
        }
    }

    // idx: 현재 인덱스, sum: 지금까지 합, picked: 고른 개수
    static void dfs(int idx, int sum, int picked) {
        // 종료 조건: 배열 끝까지 봤을 때
        if (idx == N) {
            if (sum == K && picked >= 1) {
                cnt++;
            }
            return;
        }

        // 1. 현재 idx번째 숫자를 선택하는 경우
        dfs(idx + 1, sum + A[idx], picked + 1);

        // 2. 현재 idx번째 숫자를 선택하지 않는 경우
        dfs(idx + 1, sum, picked);
    }
}
