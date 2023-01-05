package dynamic_programming;

import java.util.Scanner;

public class B_2156_dynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10005];
        int[] ans = new int[3];
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ans[0] = arr[0] + arr[1];
        ans[1] = arr[0] + arr[2];
        ans[2] = arr[1] + arr[2];

        if (n <= 3) {
            if (n == 1) {
                System.out.println(arr[0]);
            }
            else if (n == 2) {
                System.out.println(ans[0]);
            }
            else if (n == 3) {
                int max = Integer.max(ans[0], ans[1]);
                System.out.println(Integer.max(max, ans[2]));
            }
            sc.close();
            return ;
        }
        for (int i = 3; i < n; i += 3) {
            int before_ans1 = ans[1];
            int before_ans2 = ans[2];
            if (ans[0] + arr[i] + arr[i + 1] > ans[0] + arr[i] + arr[i + 2] ||
                ans[0] + arr[i] + arr[i + 1] > ans[0] + arr[i + 1] + arr[i + 2]) {
                ans[0] += arr[i] + arr[i + 1];
            }
            else if (ans[0] + arr[i] + arr[i + 2] > ans[0] + arr[i + 1] + arr[i + 2]) {
                ans[1] = ans[0] + arr[i] + arr[i + 2];
            }
            else {
                ans[2] = ans[0] + arr[i + 1] + arr[i + 2];
            }
            if (before_ans1 + arr[i] + arr[i + 2] > before_ans1 + arr[i + 1] + arr[i + 2]) {
                if (before_ans1 + arr[i] + arr[i + 2] > ans[1]) {
                    ans[1] = before_ans1 + arr[i] + arr[i + 2];
                }
            }
            else {
                if (before_ans1 + arr[i + 1] + arr[i + 2] > ans[2]) {
                    ans[2] = before_ans1 + arr[i + 1] + arr[i + 2];
                }
            }
            if (before_ans2 + arr[i + 1] + arr[i + 2] > ans[2]) {
                ans[2] = before_ans2 + arr[i + 1] + arr[i + 2];
            }
        }
        int max = Integer.max(ans[0], ans[1]);
        System.out.println(Integer.max(max, ans[2]));
        sc.close();
    }
}