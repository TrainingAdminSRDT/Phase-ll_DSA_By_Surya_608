import java.util.*;
public class tree_traversal {
    static class Node{
        int data;Node left;Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class building_tree
    {
        static int index=-1;
        public static Node tree(int node[])
        {
            index++;
            if(node[index]==-1)
            {
                return null;
            }
            Node newnode=new Node(node[index]);
            newnode.left=tree(node);
            newnode.right=tree(node);
            return newnode;
        }
    }
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+",");
        inorder(root.right);
    }
    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ,");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+",");

    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        building_tree bt=new building_tree();
        Node root=bt.tree(node);
        System.out.println(root.data);
        System.out.println();
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }
}
