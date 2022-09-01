import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_1149_dynamic {
    static int[][] arr = new int[1001][3];
    static int n;
    static int SUM = 10000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) arr[i][j] = Integer.parseInt(st.nextToken());
        }
        dfs(arr[0], 0, 0, 0);
        System.out.println(SUM);
    }
    public static void dfs(int[] del, int idx, int end, int sum) {
        if (end == n) {
            SUM = Integer.min(SUM, sum);
            return ;
        }
        for (int i = 0; i < 3; i++) {
            if (idx == i && end != 0) continue;
            end++;
            sum += del[i];
            dfs(arr[end], i, end, sum);
            sum -= del[i];
            end--;
        }
    }
}
