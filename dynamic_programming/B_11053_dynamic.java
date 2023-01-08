package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_11053_dynamic {// 정답 풀이
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i < n + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < n + 1; i++) {
            dp[i] = 1;
            for (int j = 1; j < i + 1; j++) {
                if (arr[j] < arr[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = -1;
        for (var e : dp) {
            max = e > max ? e : max;
        }
        System.out.println(max);
    }
}


// public class B_11053_dynamic { // 오답
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine());

//         int n = Integer.parseInt(st.nextToken());
//         int[] arr = new int[n + 1];
//         st = new StringTokenizer(br.readLine());

//         for (int i = 1; i < n + 1; i++) {
//             arr[i] = Integer.parseInt(st.nextToken());
//         }

//         int count = n;
//         int realCount = 0;
//         int max = Integer.MIN_VALUE;
//         for (int i = 1; i < n + 1; i++) {

//             for (int j = i; j < n + 1; j++) {
//                 if (arr[j] < arr[j - 1] || arr[j] <= max) {
//                     max = arr[j - 1];
//                     count--;
//                 }
//             }
//             if (realCount < count) {
//                 realCount = count;
//             }
//         }
//         System.out.println(realCount);
//     }
// }
