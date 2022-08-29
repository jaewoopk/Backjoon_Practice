import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

public class B_1912_dynamic {
    static int MAX = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), i = 0;
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) arr[i++] = Integer.parseInt(st.nextToken());

        for (i = 0; i < n; i++) {
            int sum = 0 ;
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum > MAX) {
                    MAX = sum;
                }
            }
        }
        System.out.println(MAX);
    }
}
