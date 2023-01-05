package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_2579_dynamic {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
    
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        int[] DP = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        DP[1] = arr[1];

        if (n >= 2) {
            DP[2] = arr[1] + arr[2];
        }

        for (int i = 3; i < n + 1; i++) {
            DP[i] = Math.max(DP[i - 2], DP[i - 3] + arr[i - 1]) + arr[i];
            System.out.println("DP[i] = " + DP[i]);
        }
        System.out.println(DP[n]);
    }
}
