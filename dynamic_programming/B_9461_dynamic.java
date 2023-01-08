package dynamic_programming;

import java.util.*;

public class B_9461_dynamic {
    static long[] arr = {1,1,1,2,2,3,4,5,7,9};
    static long[] arr2 = new long[100];
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 10; i < 100; i++) {
            arr2[i] = arr2[i - 5] + arr2[i - 1];
        }
        for (int i = 0; i < n; i++) {
            int p;
            p = sc.nextInt();
            if (p >= 1 && p <= 10) System.out.println(arr[p - 1]);
            else System.out.println(arr2[p - 1]);
        }
        sc.close();
    }    
}
