import java.util.*;

public class level_order_traversal {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    static class btree {
        static int index = -1;

        public static Node buildtree(int[] nodes) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) return null;
            Node newNode = new Node(nodes[index]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }

        public static void levelorder(Node root) {
            if (root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node current = q.poll();
                if (current == null) {
                    System.out.println();
                    if (!q.isEmpty()) q.add(null);
                } else {
                    System.out.print(current.data + " ");
                    if (current.left != null) q.add(current.left);
                    if (current.right != null) q.add(current.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        btree.index = -1;
        Node root = btree.buildtree(nodes);
        btree.levelorder(root);
    }
}
