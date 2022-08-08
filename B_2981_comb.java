import java.util.*;

public class B_2981_comb {
    public static void main(String[] args) {
        Integer n, g;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        g = arr.get(1) - arr.get(0);

        for (int i = 2; i < n; i++) {
            g = gcd(g, arr.get(i) - arr.get(i - 1));
        }
        for (int i = 2; i <= g; i++) {
            if (g % i == 0)
                System.out.print(i + " ");
        }
    }

    public static Integer gcd(int a, int b) {
        if (b == 0)
            return (a);
        return (gcd(b, a % b));
    }
}

