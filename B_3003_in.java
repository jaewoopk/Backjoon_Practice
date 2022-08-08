import java.util.*;

public class B_3003_in {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 8};
        int[] tmp = {0, 0, 0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = sc.nextInt();
            System.out.print(arr[i] - tmp[i]+ " ");
        }
    
    }
}
