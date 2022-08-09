import java.util.*;

public class B_11051_comb {
    public static void main(String[] args) {
        Integer n, k;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        
        int[][] Triangle = new int[n + 1][n + 1];

        for (int i = 0; i < Triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) Triangle[i][j] = 1;
                else Triangle[i][j] = (Triangle[i - 1][j - 1] + Triangle[i - 1][j]) % 10007;
            }
        }
        System.out.println(Triangle[n][k]);
    }
}
