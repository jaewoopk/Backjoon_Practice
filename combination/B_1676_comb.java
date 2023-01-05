import java.util.*;

public class B_1676_comb {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        if (n < 25){
            System.out.println(n / 5);
        }
        else if (n < 125){
            System.out.println((n / 5) + (n / 25));
        }
        else
            System.out.println((n / 5) + (n / 25) + (n / 125));
    }
}
