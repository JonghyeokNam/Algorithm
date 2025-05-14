import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    static int max;
    static int K;
    static Set<String>[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String[] input = br.readLine().split(" ");

            String num = input[0];
            K = Integer.parseInt(input[1]);

            max = 0;
            visited = new HashSet[K + 1];

            for (int i = 0; i <= K; i++) {
                visited[i] = new HashSet<>();
            }

            dfs(num, 0);

            System.out.println("#" + t + " " + max);
        }
    }

    static void dfs(String num, int depth) {
        if (depth == K) {
            max = Math.max(max, Integer.parseInt(num));
            return;
        }

        if (visited[depth].contains(num))
            return;
        visited[depth].add(num);

        char[] arr = num.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(arr, i, j);
                dfs(new String(arr), depth + 1);
                swap(arr, i, j);
            }
        }
    }

    static void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}