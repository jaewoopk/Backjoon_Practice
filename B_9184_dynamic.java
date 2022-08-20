import java.util.*;

public class B_9184_dynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a,b,c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a == -1 && b == -1 && c == -1)
                break ;
            System.out.println("w(" + a + ", " + b + ", " + c + ") = " + dynamic(a, b, c));
        }
    }

    public static int dynamic(int a, int b, int c) {
        if (a > 20 || b > 20 || c > 20)
            return dynamic(20, 20, 20);
        else if (a <= 0 || b <= 0 || c <= 0)
            return 1;
        
        int[][][] arr = new int[21][21][21];

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
