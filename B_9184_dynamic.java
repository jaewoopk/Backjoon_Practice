import java.util.*;
import java.io.*;

public class B_9184_dynamic {

    static int[][][] arr = new int[21][21][21];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a,b,c;
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if (a == -1 && b == -1 && c == -1)
                break ;
            System.out.println("w(" + a + ", " + b + ", " + c + ") = " + dynamic(a, b, c));
        }
    }

    public static int dynamic(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0)
            return 1;
        else if (a > 20 || b > 20 || c > 20)
            return dynamic(20, 20, 20);

        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                for (int k = 0; k < 21; k++) {
                    if (i == 0 || j == 0 || k == 0)
                        arr[i][j][k] = 1;
                    else if (i < j && j < k) {
                        arr[i][j][k] = arr[i][j][k - 1] + arr[i][j - 1][k - 1] - arr[i][j - 1][k];
                    }
                    else {
                        arr[i][j][k] = arr[i - 1][j][k] + arr[i - 1][j - 1][k] + arr[i - 1][j][k - 1] - arr[i - 1][j - 1][k - 1];
                    }
                }
            }
        }

        return arr[a][b][c];
    }
}
