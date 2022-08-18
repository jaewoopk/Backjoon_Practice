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
        if (k > t / 2)
            k = t - k;
        
        for (int i = 0; i < k; i++) {
            if ((num - i) % 5 == 0) {
                arr[0] += sharing_5(num - i);
            }
            else if ((num - i) % 2 == 0) {
                arr[1] += sharing_2(num - i);
            }
            if ((i + 1) % 5 == 0) {
                arr[2] += sharing_5(i + 1);
            }
            else if ((i + 1) % 2 == 0) {
                arr[3] += sharing_2(i + 1);
            }
        }
        System.out.println("arr0 = " + arr[0] + " arr1 = "+ arr[1] + "\narr2 = " + arr[2] + " arr3 = "+ arr[3]);
        return (arr[0] - arr[2] > arr[1] - arr[3]) ? arr[1] - arr[3] : arr[0] - arr[2];
    }
    public static int sharing_5(int num) {
        int t = 0;

        while(num > 0) {
            System.out.println("num = " + num);
            if (num % 5 == 0)
                t++;
            num /= 5;
        }
        return t;
    }

    public static int sharing_2(int num) {
        int t = 0;

        while(num > 0) {
            System.out.println("num = " + num);
            if (num % 2 == 0)
                t++;
            num /= 2;
        }
        return t;
    }
}