import java.util.ArrayList;
import java.util.Scanner;

public class B_5086_comb {
    public static void main(String[] args){
        ArrayList<Integer>[] arr = new ArrayList[10001];
        Scanner sc = new Scanner(System.in);
        Integer i = 0, a, b;

        while (true) {
            arr[i] = new ArrayList<Integer>();
            arr[i].add(sc.nextInt());
            arr[i].add(sc.nextInt());
            if (arr[i].get(0) == 0 && arr[i].get(1) == 0)
                break ;
            i++;
        }
        for (int j = 0; j < i; j++) {
            if (arr[j].get(0) < arr[j].get(1)) {
                if (arr[j].get(1) % arr[j].get(0) == 0)
                    System.out.println("factor");
                else
                System.out.println("neither");
            }
            else {
                if (arr[j].get(0) % arr[j].get(1) == 0)
                    System.out.println("multiple");
                else 
                    System.out.println("neither");
            }
        }
    }
}