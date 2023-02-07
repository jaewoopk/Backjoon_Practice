package dataStructure;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class B_11866_circleLinkedList {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();

        LinkedList<myNode> list = new LinkedList<>();

        for (int i = 1; i < n + 1; i++) {
            list.add(new myNode(i, null));
        }

        for (int i = 0; i < n - 1; i++) {
            list.get(i).next = list.get(i + 1); 
        }
        list.get(n - 1).next = list.get(0);

        myNode tmp = list.get(0);
        myNode beforeTmp = tmp;
        bw.write("<");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < k - 1; i++) {
                if (i == k - 2) {
                    beforeTmp = tmp;
                }
                tmp = tmp.next;
            }
            bw.write(String.valueOf(tmp.data));
            if (j != n - 1) {
                bw.write(", ");
            }
            beforeTmp.next = tmp.next;
            tmp = tmp.next;
        }

        bw.write(">");
        bw.flush();
        bw.close();
        sc.close();
    }
}

class myNode {
    int data;
    myNode next;

    myNode(int data, myNode next) {
        super();
        this.data = data;
        this.next = next;
    }
}
