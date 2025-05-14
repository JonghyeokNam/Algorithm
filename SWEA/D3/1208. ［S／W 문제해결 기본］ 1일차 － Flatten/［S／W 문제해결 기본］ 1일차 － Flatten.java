import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");

            int[] box = new int[100];

            for (int i = 0; i < 100; i++) {
                box[i] = Integer.parseInt(input[i]);
            }

            int min = 0;

            for (int i = 0; i < 100; i++) {
                if (min > box[i]) {
                    min = box[i];
                }
            }

            for (int i = 0; i < N; i++) {
                int maxIdx = findMaxIdx(box);
                int minIdx = findMinIdx(box);

                if (box[maxIdx] - box[minIdx] <= 1) break;

                box[maxIdx]--;
                box[minIdx]++;
            }

            int result = box[findMaxIdx(box)] - box[findMinIdx(box)];
            System.out.println("#" + t + " " + result);
        }
    }

    static int findMaxIdx(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static int findMinIdx(int[] arr) {
        int min = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }
}