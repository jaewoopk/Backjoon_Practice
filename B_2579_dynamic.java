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
        dfs(0, 0, 0);
        System.out.println(MAX);
    }
    public static void dfs(int sum, int idx, int count) {
        if (idx == n - 1 && count != 2) {
            MAX = Math.max(sum, MAX);
            return ;
        }
        else if (idx >= n - 1) return ;
        if (count == 2) {
            sum += arr[idx];
            idx += 2;
            count = 0;
            dfs(sum, idx, count);
            return ;
        }
        for (int i = idx; i < idx + 2; i++) {
            sum += arr[i];
            count++;
            idx++;
            dfs(sum, idx, count);
            sum -= arr[i];
            count--;
            idx--;
        }
    }
}
