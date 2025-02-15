import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        getPN(M, N);
    }

    public static void getPN(int M, int N) {
        int[] arr = new int[N + 1];
        StringBuilder sb = new StringBuilder();

        //배열 초기화
        for (int i = 2; i <= N; i++) {
            arr[i] = i;
        }

        //2부터 시작해서 i의 배수들을 배열에서 지워준다
        for (int i = 2; i <= N; i++) {
            //이미 지워진 수는 건너뛴다
            if (arr[i] == 0) continue;
            for (int j = i + i; j <= N; j += i) {
                arr[j] = 0;
            }
        }
        for (int i = M; i <= N; i++) {
            if (arr[i] != 0) 
                sb.append(i + "\n");
        }
        System.out.print(sb);
    }
}
