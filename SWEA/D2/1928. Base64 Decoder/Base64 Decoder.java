import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		String Base64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
            
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			String encoded = sc.next();
            StringBuilder binary = new StringBuilder();
            
            for (int i = 0; i < encoded.length(); i++) {
                char ch = encoded.charAt(i);
            	int index = Base64.indexOf(ch);
                String bin = String.format("%6s", Integer.toBinaryString(index)).replace(' ', '0');
                binary.append(bin);
            }
            
            StringBuilder decoded = new StringBuilder();
            for (int i = 0; i + 8 <= binary.length(); i += 8) {
            	String str = binary.substring(i, i + 8);
                int ascii = Integer.parseInt(str, 2);
                decoded.append((char)ascii);
            }
			
            System.out.println("#" + test_case + " " + decoded);
		}
	}
}