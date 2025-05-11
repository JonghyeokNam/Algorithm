import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= 10; t++) {
//            String[] input = br.readLine().split(" ");
            int T = sc.nextInt();

            int N = sc.nextInt();
            int M = sc.nextInt();
//            int N = Integer.parseInt(input[0]);
//            int M = Integer.parseInt(input[1]);

            int result = 1;

            for (int i = 0; i < M; i++) {
                result *= N;
            }

            System.out.println("#" + t + " " + result);
        }
    }
}