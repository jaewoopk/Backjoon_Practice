package dataStructure;

import java.util.Scanner;
import java.util.LinkedList;

public class B_11866_circleLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i < n + 1; i++) {
            list.add(i);
        }

        while (!list.isEmpty()) {
            System.out.println(list.remove(k));
        }

        sc.close();
    }
}
