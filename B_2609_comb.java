import java.util.*;

public class B_2609_comb {
    public static void main(String[] args) {
        Integer n, m, min;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        min = 1;
        for (int i = 1; i < ((n > m)? n : m) + 1; i++) {
            if (n % i == 0 && m % i == 0 && i > min)
                min = i;   
        }
        System.out.println(min);
        System.out.println(min * (n / min) * (m / min));
    }
}
