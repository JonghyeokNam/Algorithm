import java.util.*;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			int N = sc.nextInt();
            
            int count2 = 0;
            int count3 = 0;
            int count5 = 0;
            int count7 = 0;
            int count11 = 0;
            
            while(N % 2 == 0) {
            	N /= 2;
                count2++;
            }
            while(N % 3 == 0) {
            	N /= 3;
                count3++;
            }
            while(N % 5 == 0) {
            	N /= 5;
                count5++;
            }
            while(N % 7 == 0) {
            	N /= 7;
                count7++;
            }
            while(N % 11 == 0) {
            	N /= 11;
                count11++;
            }

            System.out.println("#" + test_case + " " + count2 + " " + count3 + " " + count5 + " " + count7 + " " + count11);
		}
	}
}