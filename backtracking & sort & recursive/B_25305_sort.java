import java.util.*;

public class B_25305_sort {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        // Collections에 대해 알아볼 것
        Collections.sort(list);
        System.out.println(list.get(n - m));
    }
}
