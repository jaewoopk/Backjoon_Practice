import java.util.*;

public class B_2599_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();

        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
        sc.close();
    }    
}
