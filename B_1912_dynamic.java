import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

public class B_1912_dynamic {
    static int MAX;
    static int MIN;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), i = 0;
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) arr[i++] = Integer.parseInt(st.nextToken());

        int sum = 0;
        boolean maxcheck = false, mincheck = false;
        MAX = arr[0];
        MIN = arr[0];
        for (i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > MAX) {
                MAX = sum;
                maxcheck = true;
            }
            if (sum < MIN) {
                mincheck = true;
                MIN = sum;
                MAX = sum;
            }
        }
        if (!maxcheck) {
            Arrays.sort(arr);
            System.out.println(arr[n-1]);
        }
        else if (!mincheck) System.out.println(MAX);
        else System.out.println(MAX - MIN);
    }
}
