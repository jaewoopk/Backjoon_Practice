import java.util.*;

public class B_14889_backtrack {
    static int n;
    static int MIN = Integer.MAX_VALUE;
    static int[][]  arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) arr[i][j] = sc.nextInt();
        }
        dfs();
        System.out.println(MIN);
    }

    public static void dfs() {

        /*
        int val1 = 0;
        int val2 = 0;
        val1 = arr[0][1] + arr[0][3] + arr[0][4] + arr[1][3] + arr[1][4] + arr[3][4];
        val1 += arr[1][0] + arr[3][0] + arr[4][0] + arr[3][1] + arr[4][1] + arr[4][3];
        val2 = arr[2][5] + arr[2][6] + arr[2][7] + arr[5][6] + arr[5][7] + arr[6][7];
        val2 += arr[5][2] + arr[6][2] + arr[7][2] + arr[6][5] + arr[7][5] + arr[7][6];
        System.out.println(Math.abs(val1 - val2));
        */
        // (n)C(c/2) -> 이게 총 개수이고, 이를 i j를 토대로 배열값에 넣어서 계산하면 될 듯

    }
}
