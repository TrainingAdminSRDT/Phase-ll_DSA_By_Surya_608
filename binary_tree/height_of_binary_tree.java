import java.util.*;
public class height_of_binary_tree {
    static class Node
    {
        int data;Node left;Node right;
        Node(int data)
        {
            this.data=data;this.left=null;this.right=null;
        }
    }
    static class binarytree
    {
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
        public static int height(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh, rh)+1;
        }
}
public static void main(String[] args) {
        binarytree b=new binarytree();
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
      System.out.println(  b.height(root.left.right));
}
}
