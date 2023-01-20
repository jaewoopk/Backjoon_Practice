import java.util.Scanner;

public class B_10807_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr;
        n = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num;
        int count = 0;
        num = sc.nextInt();
        for (var e : arr) {
            if (e == num) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
