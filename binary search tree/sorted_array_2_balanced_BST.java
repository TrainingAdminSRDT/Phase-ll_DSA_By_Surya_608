import java.util.*;
public class sorted_array_2_balanced_BST {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
        }
    }
    
    public static Node create(int arr[],int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid=start+(end-start)/2;
        Node root=new Node(arr[mid]);
        root.left=create(arr, start, mid-1);
        root.right=create(arr, mid+1, end);
        return root;

    }
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
         System.out.print(root.data+" ");
        inorder(root.left);
       
        inorder(root.right);
         
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
        
        Node root=create(arr, 0, arr.length-1);
        inorder(root);
        
      
}
}
