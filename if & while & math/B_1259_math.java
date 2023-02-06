import java.util.Scanner;

public class B_1259_math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = null;
        while (true) {
            n = sc.nextLine();
            if (n.equals("0")) {
                break ;
            }
            findPd(n);
        }
        sc.close();
    }
    static void findPd(String str) {
        for (int i = 0; i < str.length() / 2 + 1; i++) {
            if (str.charAt(i) != (str.charAt(str.length() - i - 1))) {
                System.out.println("no");
                return ;
            }
        }
        System.out.println("yes");
    }
}
