package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10844_dynamic {
    static final long T = 1000000000;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long count = 0;
        long[][] dp = new long[n][10];

        for (int i = 1; i < 10; i++) dp[0][i] = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) dp[i][0] = dp[i - 1][1] % T;
                else if (j == 9) dp[i][9] = dp[i - 1][8] % T;
                else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % T;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            count += dp[n - 1][i];
        }
        System.out.println(count % T);
    }
}
