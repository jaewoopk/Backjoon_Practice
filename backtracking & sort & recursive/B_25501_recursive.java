import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_25501_recursive {
    static int sum = 0;
    public static int recursion(String s, int l, int r){
        sum++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            sum = 0;
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            System.out.println(isPalindrome(str) + " " + sum);
        }
    }
}
