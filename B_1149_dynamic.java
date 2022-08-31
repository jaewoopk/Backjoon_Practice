import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_1149_dynamic {
    static int[][] arr = new int[1000][3];
    static int SUM = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) arr[i][j] = Integer.parseInt(st.nextToken());
        }
        int min = arr[0][0] > arr[0][1] ? arr[0][1] : arr[0][0];
        TreeNode root = new TreeNode(Integer.min(min, arr[0][2]));
        int idx;
        if (min == arr[0][0]) idx = 0;
        else if (min == arr[0][1]) idx = 1;
        else idx = 2;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if (idx == j) continue;
                TreeNode newNode = new TreeNode(arr[i][j]);
                if (root.left == null)
                    root.left = newNode;
                else
                    root.right = newNode;
            }
        }
        System.out.println(SUM);
    }    
}

class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    public TreeNode findLeftNode(TreeNode node) {
        while (node.left != null) node = node.left;
        return node;
    }

    public TreeNode findRightNode(TreeNode node) {
        while (node.right != null) node = node.right;
        return node;
    }
}