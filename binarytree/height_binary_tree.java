import java.util.*;
public class height_binary_tree { static class Node{
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
    static class building_tree{
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
public static int height(Node root)
{
    if(root==null)
    {
        return 0;
    }
    int lefth=height(root.left);
    int righth=height(root.right);
    return Math.max(lefth, righth)+1;

}
 public static void main(String[] args) {
         int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        building_tree bt=new building_tree();
        Node root=bt.tree(node);
        System.out.println("height of binarytree="+height(root));
}
}
