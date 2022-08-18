import java.util.*;

public class B_2004_comb {
    public static void main(String[] args) {
        int n, m;
        int[] arr = {0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println(dismantling(n, m, arr, n));
    }
    
    public static int dismantling(int num, int k, int[] arr, int t) {
        int result1 = 0;
        int result2 = 0;

        if (k > t / 2)
            k = t - k;
        
        for (int i = 0; i < k; i++) {
            if ((num - i) % 5 == 0 || (num - i) % 2 == 0) {
                sharing(num - i, arr);
            }
            if ((i + 1) % 5 == 0 || (i + 1) % 2 == 0) {
                sharing2(i + 1, arr);
            }
        }
        System.out.println("arr0 = " + arr[0] + " arr1 = "+ arr[1] + "\narr2 = " + arr[2] + " arr3 = "+ arr[3]);
        result1 = (arr[0] > arr[1]) ? arr[1] : arr[0];
        result2 = (arr[2] > arr[3]) ? arr[3] : arr[2];
        return (result1 - result2);
    }
    public static void sharing(int num, int[] arr) {
        while(num > 0) {
            if (num % 5 == 0) {
                arr[0]++;
                num /= 5;
            }
            else if (num % 2 == 0) {
                arr[1]++;
                num /= 2;
            }
            else
                break ;
        }
    }

    public static void sharing2(int num, int[] arr) {
        while(num > 0) {
            if (num % 5 == 0) {
                arr[2]++;
                num /= 5;
            }
            else if (num % 2 == 0) {
                arr[3]++;
                num /= 2;
            }
            else
                break ;
        }
    }
}