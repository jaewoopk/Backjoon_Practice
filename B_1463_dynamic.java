import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_1463_dynamic {
    static int[] arr = new int[1000005];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr[1] = 0;
        for (int i = 2; i < n + 1; i++) {
            arr[i] = arr[i - 1] + 1;
            if (i % 2 == 0) arr[i] = Math.min(arr[i], arr[i / 2] + 1);
            if (i % 3 == 0) arr[i] = Math.min(arr[i], arr[i / 3] + 1);
        }
        // dfs말고 dp로 풀 생각을 할 것, 그리고 꾸준히 다시 볼 것
        System.out.println(arr[n]);
    }    
}
