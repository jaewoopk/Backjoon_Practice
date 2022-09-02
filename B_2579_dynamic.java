import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_2579_dynamic {
    static int[] arr;
    static int n;
    static int MAX = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = n -1; i > 1; i--) {
            arr[n - 1] += Math.max(arr[i - 1], arr[i - 2]);
            if (Math.max(arr[i - 1], arr[i - 2]) == arr[i - 2]) i--;
        }
        System.out.println(arr[n - 1]);
    }
}
