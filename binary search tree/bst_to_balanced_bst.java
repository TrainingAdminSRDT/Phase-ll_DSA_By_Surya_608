import java.util.*;
public class bst_to_balanced_bst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
        }
    } 
    public static void inoreder(Node root,ArrayList<Integer>L)
    {
        if(root==null)
        {
            return;
        }
        inoreder(root.left, L);
        L.add(root.data);
        inoreder(root.right, L);
    }
    public static Node create(ArrayList<Integer>L,int start,int end)
    {
        if(start>end)
        {
            return null;
        }
       
        int mid=start+(end-start)/2;
         Node root=new Node(L.get(mid));
        root.left=create(L, start, mid-1);
        root.right=create(L, mid+1, end);
        return root;
    }
    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node balancedbst(Node root)
    {
        
        ArrayList<Integer>L=new ArrayList<>();
        inoreder(root, L);
        root=create(L, 0, L.size()-1);
        return root;
    }
    
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
        root=balancedbst(root);
        preorder(root);
        
    }

}
