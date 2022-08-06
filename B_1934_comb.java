import java.util.*;

public class B_1934_comb {
    public static void main(String[] args) {
        Integer T, min;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>[] arr = new ArrayList[1001];
        
        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            arr[i] = new ArrayList<Integer>();
            arr[i].add(sc.nextInt());
            arr[i].add(sc.nextInt());   
        }
        for (int i = 0; i < T; i++) {
            min = 1;
            for (int j = 1; j < (arr[i].get(0) > arr[i].get(1)? arr[i].get(0) : arr[i].get(1)) + 1; j++) {
                if (arr[i].get(0) % j == 0 && arr[i].get(1) % j == 0 && min < j)
                    min = j;
            }
            System.out.println(min * (arr[i].get(0) / min) * (arr[i].get(1) / min));
        }
    }
}
