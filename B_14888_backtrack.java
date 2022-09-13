import java.util.*;

public class B_14888_backtrack {
    static int max = -1000000002;
    static int min = 1000000001;
    static int[] arr;
    static int[] sign = new int[4];
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < 4; i++) sign[i] = sc.nextInt();
        backtracking(arr[0], 1) ;
        System.out.println(max);
        System.out.println(min);
    }

    public static void backtracking(int num, int idx) {
        if (idx == n) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return ;
        }

        for (int i = 0; i < 4; i++) {
            if (sign[i] > 0) {
                sign[i]--;
                switch (i) {
                    case 0 : backtracking(num + arr[idx], idx + 1); break;
                    case 1 : backtracking(num - arr[idx], idx + 1); break;
                    case 2 : backtracking(num * arr[idx], idx + 1); break;
                    case 3 : backtracking(num / arr[idx], idx + 1); break;
                }
                sign[i]++;
            }
        }
    }
}
