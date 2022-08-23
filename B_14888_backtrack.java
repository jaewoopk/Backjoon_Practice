import java.util.*;

public class B_14888_backtrack {
    static int max = -1000000001;
    static int min = 1000000001;
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        int sign[] = {0, 0, 0, 0};

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < 4; i++) sign[i] = sc.nextInt();
        backtracking(arr, sign, 0, 0);
        System.out.println(max);
        System.out.println(min);
    }

    public static void backtracking(int[] arr, int[] sign, int ans, int count) {
        if (count >= arr.length - 1) {
            if (ans > max) max = ans;
            if (ans < min) min = ans;
            return ;
        }
        else if (count == 0) ans = arr[0];

        for (int i = count; i < arr.length - 1; i++) {
            if (arr[count] != arr[i])
                break ;
            for (int j = 0; j < 4; j++) {
                if (sign[j] == 0) continue;
                if (j == 0) ans += arr[i + 1];
                else if (j == 1) ans -= arr[i + 1]; 
                else if (j == 2) ans *= arr[i + 1]; 
                else if (j == 3) {
                    if (ans < 0) {
                        ans *= -1;
                        ans /= arr[i + 1];
                        ans *= -1;
                    }
                    else ans /= arr[i + 1];
                }
                sign[j]--;
                backtracking(arr, sign, ans, ++count);
                sign[j]++;
                count--;
                if (j == 0) ans -= arr[i + 1];
                else if (j == 1) ans += arr[i + 1]; 
                else if (j == 2) {
                    if (ans < 0) {
                        ans *= -1;
                        ans /= arr[i + 1];
                        ans *= -1;
                    }
                    else ans /= arr[i + 1];
                }
                else if (j == 3) ans *= arr[i + 1];
            }
        }
    }
}