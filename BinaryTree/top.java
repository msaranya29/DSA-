import java.util.*;

public class top {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Info {
        Node node;
        int hd;

        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topview(Node root) {
        Queue<Info> q = new LinkedList<>();
        TreeMap<Integer, Node> map = new TreeMap<>();

        q.add(new Info(root, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }

            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
            }

            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
            }
        }

        // ✅ Safe printing
        for (Node node : map.values()) {
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topview(root);
    }
}
