import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_10844_dynamic {
    static int[] arr = new int[101];
    static int n;
    static int count = 0;
    static boolean correct = false;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        dfs(0);
        System.out.println(count);
    }
    public static void dfs(int idx) {
        if (idx == n && correct) {
            for (int i = 0; i < n; i++) {
                System.out.print(" ans => " + arr[i]);
            }
            System.out.println("");
            count++;
            return ;
        }
        else if (idx == n) return ;

        for (int i = 0; i <= 9; i++) {
            if (idx == 0 && i == 0) continue ;
            arr[idx] = i;
            if ((idx > 0 && Math.abs(arr[idx - 1] - arr[idx]) == 1) || idx == 0) {
                correct = true;
                dfs(++idx);
                idx--;
                correct = false;
            }
        }
    }
}
