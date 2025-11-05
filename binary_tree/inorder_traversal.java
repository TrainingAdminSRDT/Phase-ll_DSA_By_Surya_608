import java.util.*;
public class inorder_traversal {
    static class Node{
        int data;Node left;Node right;
        Node(int data)
        {
            this.data=data;this.left=null;this.right=null;
        }
    }
    static class btree{
        static int indx=-1;
        public static Node buildtree(int node[])
        {
            indx++;
            if(node[indx]==-1)
            {
                return null;
            }
            Node newnode=new Node(node[indx]);
            newnode.left=buildtree(node);
            newnode.right=buildtree(node);
            return newnode;
        }
        public static void inorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);

        }
    }
     public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        btree tree = new btree();
        Node root = tree.buildtree(nodes);

        System.out.println("inorder traversal of the built tree:");
        tree.inorder(root);
    }
}
