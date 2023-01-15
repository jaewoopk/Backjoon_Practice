package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_11054_dynamic {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] dp1 = new int[n + 1];
        int[] dp2 = new int[n + 1];
        int[] arr = new int[n + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i < n + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp1[i] = 1;
            dp2[i] = 1;
        }
    
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                if (arr[j] < arr[i] && dp1[i] < dp1[j] + 1) {
                    dp1[i] = dp1[j] + 1;
                }
            }
        }
        for (int i = n; i > 0; i--) {
            for (int j = n; j > i - 1; j--) {
                if (arr[j] < arr[i] && dp2[i] < dp2[j] + 1) {
                    dp2[i] = dp2[j] + 1;
                }
            }
        }
        int max = 1;
        for (int i = 1; i < n + 1; i++) {
            max = Math.max(dp1[i] + dp2[i], max);
        }
        if (max == 1) System.out.println(1);
        else System.out.println(max - 1);
    }
}
