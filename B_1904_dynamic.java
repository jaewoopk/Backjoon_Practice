import java.util.*;

public class B_1904_dynamic {
    static int[] arr = new int[1000001];
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < 1000001; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[n - 1]);
    
    }
}
