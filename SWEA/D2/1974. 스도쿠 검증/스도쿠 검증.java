import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int[][] puzzle = new int[9][9];
            for (int i = 0; i < 9; i++) {
                String[] input = br.readLine().split(" ");
                for (int j = 0; j < 9; j++) {
                    puzzle[i][j] = Integer.parseInt(input[j]);
                }
            }

            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            Boolean isTrue = true;

            for (int i = 0; i < 9; i++) {
                int[] tmpArr = new int[9];
                for (int j = 0; j < 9; j++) {
                    tmpArr[j] = puzzle[i][j];
                }
                Arrays.sort(tmpArr);
                if (!Arrays.equals(arr, tmpArr)) {
                    isTrue = false;
                }
            }

            for (int i = 0; i < 9; i++) {
                int[] tmpArr = new int[9];
                for (int j = 0; j < 9; j++) {
                    tmpArr[j] = puzzle[j][i];
                }
                Arrays.sort(tmpArr);
                if (!Arrays.equals(arr, tmpArr)) {
                    isTrue = false;
                }
            }

            for (int i = 0; i < 7; i += 3) {
                for (int j = 0; j < 7; j += 3) {
                    int[] tmpArr = new int[9];
                    int n = 0;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            tmpArr[n] = puzzle[i + k][j + l];
                            n++;
                        }
                    }
                    Arrays.sort(tmpArr);
                    if (!Arrays.equals(arr, tmpArr)) {
                        isTrue = false;
                    }
                }
            }

            System.out.print("#" + t + " ");

            if (isTrue) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}