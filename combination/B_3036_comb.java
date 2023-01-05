import java.util.*;;

public class B_3036_comb {
    public static void main(String[] args) {
        Integer n, g;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            arr.add(sc.nextInt());        
        }
        
        for (int i = 1; i < n; i++) {
            g = gcd(arr.get(0), arr.get(i));
            System.out.println(arr.get(0) / g +"/" + arr.get(i) / g);
        }
    }

    public static Integer gcd(Integer a, Integer b) {
        if (b == 0)
            return a;
        return (gcd(b, a % b));
    }
}
