package dataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B_10845_queue {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        Deque<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
            case "push" :
                int num = Integer.parseInt(st.nextToken());
                q.addLast(num);
                break ;
            case "pop" :
                if (q.size() <= 0) {
                    bw.write("-1\n");
                }
                else {
                    int qpf = q.peekFirst();
                    q.pollFirst();
                    bw.write(qpf + "\n");
                }
                break ;
            case "size" :
                int qsize = q.size();
                bw.write(qsize + "\n");
                break ;
            case "empty" :
                if (q.isEmpty()) {
                    bw.write("1\n");
                }
                else {
                    bw.write("0\n");
                }
                break ;
            case "front" :
                if (q.size() <= 0) {
                    bw.write("-1\n");
                }
                else {
                    int qpf2 = q.peekFirst();
                    bw.write(qpf2 + "\n");
                }
                break ;
            case "back" :
                if (q.size() <= 0) {
                    bw.write("-1\n");
                }
                else {
                    int qpl = q.peekLast();
                    bw.write(qpl + "\n");
                }
                break ;
            }
        }
        bw.flush();
        bw.close();
    }
}
