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
        dfs(n / 2,0, new int[n / 2], 0);
        System.out.println(MIN);
    }

    public static void dfs(int m, int idx, int[] tmp, int k) {

        if (idx == n / 2) {
            int t = 0;
            int[] tmp2 = new int[m];
            for (int i = 0; i < n; i++) {
                boolean check = false;
                for (int j : tmp) {
                    if (i == j) {
                        check = true;
                        break ;
                    }
                }
                if (!check) {
                    tmp2[t++] = i;
                }
            }
            int answer = 0;
            int answer2 = 0;
            for (int i : tmp) {
                for (int j : tmp) {
                    if (i >= j) continue;
                    answer += (arr[i][j] + arr[j][i]);
                }
            }
            for (int i : tmp2) {
                for (int j : tmp2) {
                    if (i >= j) continue;
                    answer2 += (arr[i][j] + arr[j][i]);
                }
            }
            answer = answer - answer2;
            answer = Math.abs(answer);
            if (answer < MIN) {
                MIN = answer;
            }
            return ;
        }
        for (int i = k; i < n; i++) {
            tmp[idx] = i;
            k++;
            dfs(m,idx + 1, tmp, k);
        }
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
