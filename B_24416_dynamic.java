import java.util.Scanner;

public class B_24416_dynamic {
    public static void main(String[] args) {
        int[] arr = new int[50];
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        System.out.println(fibo(n) + " " + fibonacci(n, arr));


    }
    public static int fibo(int n) {
        if (n == 1 || n == 2)
            return 1;
        return (fibo(n - 1) + fibo(n - 2));
    }
    public static int fibonacci(int n, int[] arr) {
        int tmp = 0;

        arr[1] = arr[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            tmp++;
        }
        return tmp;
    }
}
