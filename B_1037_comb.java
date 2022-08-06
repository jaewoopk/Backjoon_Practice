import java.util.*;

public class B_1037_comb {
    public static void main(String[] args) {
        Integer n;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner cs = new Scanner(System.in);

        n = cs.nextInt();
        for (int i = 0; i < n; i++){
            arr.add(cs.nextInt());
        }
        Collections.sort(arr);
        
        if (n % 2 == 0)
            System.out.println((arr.get(0) * arr.get(n - 1)));
        else
            System.out.println(arr.get(n / 2) * arr.get(n / 2));
    }
}
