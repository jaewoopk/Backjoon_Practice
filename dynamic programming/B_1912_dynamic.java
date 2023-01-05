import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

public class B_1912_dynamic {
    static int MAX;
    static int MIN;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), i = 0;
        int[] arr = new int[n];
        int[] dp = new int[n];

        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) arr[i++] = Integer.parseInt(st.nextToken());

        dp[0] = arr[0];
        MAX = arr[0];
        for (i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
            MAX = Math.max(dp[i], MAX);
        }
        System.out.println(MAX);
    }
}
