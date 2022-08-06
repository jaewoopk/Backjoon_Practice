import java.util.*;

public class B_2981_comb {
    public static void main(String[] args) {
        Integer n, count;
        Long min, tmp, x;
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> arr = new ArrayList<Long>();
        
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLong());
        }
        Collections.sort(arr);
        min = arr.get(0);
        x = min;
        for (int i = 2; i < min + 1; i++) {
            tmp = min % i;
            count = 0;
            for (int j = 0; j < n; j++) {
                if (arr.get(j) % i == tmp)
                    count++;
                else
                    break ;
            }
            if (count == n)
            {
                System.out.print(i+" ");
                x = (long) i;
            }
        }
        x += min;
        for (int i = 0; i < 100; i++) {
            if (x > arr.get(n - 1))
                break ;
            System.out.print(x+" ");
            x *= 2;
        }
    }
}
