import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_1463_dynamic {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        while (n != 1) {
            if (n % 3 == 0) {
                n /= 3;
            }
            else if (n % 4 == 0) {
                n /= 2;
            }
            else if ((n - 1) % 3 == 0) {
                n--;
            }
            else if ((n - 1) % 4 == 0) {
                n--;
            }
            else if (n % 2 == 0) {
                n /= 2;
            }
            else n--;
            count++;
        }
        System.out.println(count);
    }    
}
