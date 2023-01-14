import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_24060_sort {
    static int count;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        merge_sort(arr, 0, n - 1);
        System.out.println(count);
        for (var e : arr) {
            System.out.print(" " + e);
        }
    }
    static void merge_sort(int[] arr,int p, int r) {
        int q;
        count++;
        System.out.println("merge sort count = " + count + " q = " + arr[((p + r) / 2)]);
        for (var e : arr) {
            System.out.print(" " + e);
        }
        System.out.println();
        if (p < r) {
            q = (p + r) / 2;
            merge_sort(arr, p, q);
            merge_sort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }
    
    static void merge(int[] arr, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;
        count++;
        
        System.out.println();
        int[] tmp = new int[arr.length];
        while (i <= q && j <= r) {
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            }
            else {
                tmp[t++] = arr[j++];
            }
        }
        
        while (i <= q) {
            tmp[t++] = arr[i++];
        }
        while (j <= r) {
            tmp[t++] = arr[j++];
        }
        i = p;
        t = 0;
        while (i <= r) {
            arr[i++] = tmp[t++];
        }
        System.out.println("merge count = " + count + " q = " + arr[((p + r) / 2)]);
        for (var e : arr) {
            System.out.print(" " + e);
        }
        System.out.println();
    }
}
