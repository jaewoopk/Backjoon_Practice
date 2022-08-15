import java.util.*;

public class B_2004_comb {
    public static void main(String[] args) {
        int n,m, total1 = 1, total2 = 1;
        int[] arr = {0, 0};
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        total1 = dismantling(n, m, arr, n);
        arr[0] = 0;
        arr[1] = 0;
        total2 = dismantling(m, m, arr, n);
        System.out.println(total1 - total2);
    }
    // 잘 쪼개서 분류해야할 것 같음 - 알고리즘에 대해 생각해보자
    public static int dismantling(int num, int k, int[] arr, int t) {
        int tmp = 1;
        if (num == k && k > t / 2) {
            k = t - k;
            num = k;
        }
        else if (k > t / 2)
            k = t - k;
        
        for (int i = num; i > (num - k); i--) {
            tmp = i;
            while (tmp > 0) {
                if (tmp % 5 == 0) {
                    arr[0]++;
                    tmp /= 5;
                }
                else if (tmp % 2 == 0) {
                    arr[1]++;
                    tmp /= 2;
                }
                else
                    break ;
            }
        }
        //System.out.println("arr0 = " + arr[0] + " arr1 = "+ arr[1]);
        return (arr[0] > arr[1]) ? arr[1] : arr[0];
    }
}