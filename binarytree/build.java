import java.util.*;
public class build {
    static class Node
    {
        int data;Node left;Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    static class buildtree
    {
        static int index=-1;
        public static Node bulding(int node[])
        {
            index++;
            if(node[index]==-1)
            {
                return null;

            }
            Node newnode=new Node(node[index]);
            newnode.left=bulding(node);
            newnode.right=bulding(node);
            return newnode;
        }

    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        buildtree bt=new buildtree();
        Node root=bt.bulding(node);
        System.out.println(root.data);
    }
    
}
