import java.util.*;
import java.math.*;

public class B_2004_comb {
    public static void main(String[] args) {
        int n, m;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println(dismantling(n, m));
    }
    
    public static int dismantling(int n, int m) {
        int count5 = 0, count2 = 0;

        count5 = sharing5(n) - sharing5(n - m) - sharing5(m);
        count2 = sharing2(n) - sharing2(n - m) - sharing2(m);
        return (Math.min(count5, count2));
    }
    public static int sharing5(int num) {
        int count = 0;

        while(num >= 5) {
            count += num / 5;
            num /= 5;    
        }
        return count;
    }
    public static int sharing2(int num) {
        int count = 0;

        while(num >= 2) {
            count += num / 2;
            num /= 2;    
        }
        return count;
    }
}