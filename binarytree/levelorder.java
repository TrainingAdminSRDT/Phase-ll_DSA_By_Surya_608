
import java.util.*;


public class levelorder {
    static class Node{
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
    public static void level(Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node cur=q.remove();
            if(cur==null)
            {
                System.out.println();
        if(q.isEmpty())
        {
            break;
        }
        else{
            q.add(null);
        }
            }
            else{
                System.out.println(cur.data+" ");
                if(cur.left!=null)
                {
                    q.add(cur.left);
                }
                if(cur.right!=null)
                {
                    q.add(cur.right);
                }
            }
        
        }
    }
    public static void main(String[] args) {
         int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        building_tree bt=new building_tree();
        Node root=bt.tree(node);
        level(root);
    }

    
}
