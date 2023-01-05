import java.io.IOException;
import java.util.*;

public class B_1010_comb {
    public static void main(String[] args) throws IOException {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int k = 0; k < n; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int bigger = x > y ? x : y;
            int minor = x < y ? x : y;

            int[][] Triangle = new int[bigger + 1][bigger + 1];

            for (int i = 0; i < Triangle.length; i++) {
                for (int j = 0; j <= i; j++) {
                    if (i == j || j == 0) Triangle[i][j] = 1;
                    else Triangle[i][j] = (Triangle[i - 1][j - 1] + Triangle[i - 1][j]);
                }
            }
            System.out.println(Triangle[bigger][minor]);
        }
    }
}