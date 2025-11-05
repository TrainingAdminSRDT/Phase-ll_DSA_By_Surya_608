import java.util.*;
public class inorderb_traversal
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class b
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
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder( root.right);
    }
}
public static void main(String[] args) {
    int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,9,-1,-1};
    b nn=new b();
    Node root=b.buildtree(node);
    nn.inorder(root);


}
}
