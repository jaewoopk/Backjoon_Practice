package dataStructure;

import java.util.Scanner;

public class B_15829_hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        long sum = 0;
        long pow = 1;
        for (int i = 1; i < n + 1; i++) {
            int t = str.charAt(i - 1) - 'a' + 1;
            sum += (t * pow);
            pow = (pow * 31) % 1234567891;
        }
        System.out.println(sum % 1234567891);
        sc.close();
    }
}

// public class B_15829_hashing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         String str = sc.next();
//         char[] cpStr = new char[str.length()];
//         for (int i = 0; i < n; i++) {
//             cpStr[i] = str.charAt(n - i - 1);
//             cpStr[i] -= 'a' - 1;
//         }
        
//         String cp = String.copyValueOf(cpStr);
        
//         System.out.println(cp.hashCode());
//         sc.close();
//     }
// }