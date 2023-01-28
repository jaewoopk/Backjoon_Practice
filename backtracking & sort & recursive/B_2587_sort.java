import java.util.Arrays;
import java.util.Scanner;

public class B_2587_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mean = 0;
        int mid = 0;
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            arr[i] = num;
            mean += num;
        }
        Arrays.sort(arr);
        System.out.println(mean / 5);
        System.out.println(arr[2]);
        sc.close();
    }
}
