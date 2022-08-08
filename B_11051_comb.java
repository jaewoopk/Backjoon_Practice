import java.util.*;

public class B_11051_comb {
    public static void main(String[] args) {
        Integer n, k, tmp1, tmp2, res;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        
        if (n - k == 0 || k == 0)
        {
            System.out.println("1");
            return ;
        }
        tmp1 = 1;
        tmp2 = 1;
        res = 1;
        for (int i = 0; i < k; i++) {
            tmp1 *= (n - i);
            tmp2 *= (k - i);
            res = tmp1 / tmp2;
            if (res >= 10007)
                res = (tmp1 / tmp2) % 10007;
            if (tmp1 >= 10007)
                tmp1 %= 9993;
            if (tmp2 >= 10007)
                tmp2 %= 10007;
            System.out.println(res +" " +tmp1 +" "+ tmp2);
        }
        System.out.println(((12*11*10*9*8) / 120) % 10007);
        System.out.println(res);
    }
}
