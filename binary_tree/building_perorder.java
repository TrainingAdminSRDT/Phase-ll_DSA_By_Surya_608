import java.util.*;

public class building_perorder {
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
         public static void preorder(Node root) {
            if (root == null) return;

            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree=new binarytree();
        Node root=tree.buildtree(node);
          System.out.println("Preorder traversal of the built tree:");
        tree.preorder(root);
        
       
    }
    
}
