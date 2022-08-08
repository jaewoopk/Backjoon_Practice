import java.util.*;

public class B_11050_comb {
    public static void main(String[] args) {
        Integer n, k;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        System.out.println((pactorial(n) / (pactorial(k) * pactorial(n - k))));

    }
    public static Integer pactorial(Integer num) {
        if (num == 0)
            return (1);
        if (num == 1)
            return (num);
        return (num * pactorial(num - 1));
    }
}
