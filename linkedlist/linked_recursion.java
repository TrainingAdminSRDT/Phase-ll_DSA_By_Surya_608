import java.util.*;
public class linked_recursion {
    public static class node{
        int data;
          node next;
          public  node( int data)
          {
            this.data=data;
            this.next=next;
          }
    }
    public static node head;
    public static node tail;
    public void  addnode(int data)
    {
        node ad=new node(data);
        if(head==null)
        {
            head=tail=ad;
            return;
        }
        tail.next=ad;
        tail=ad;


    }
    //search node recursively
    public static int helper(node head,int key)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data==key)
        {
            return 0;
        }
        int index=helper(head.next, key);
        if(index==-1)
        {
            return -1;
        }
        return index+1;
    }
    public static int recsearch(node head,int key)
    {
        return helper(head, key);
    }
    public static void printnode()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"------");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linked_recursion sm=new linked_recursion();
         sm.addnode(1);
        sm.addnode(2);
        sm.addnode(3);
        sm.addnode(4);sm.addnode(5);sm.addnode(6);sm.addnode(7);sm.addnode(8);sm.addnode(9);
        System.out.println("key index ="+recsearch(head,6));
        printnode();
    }
    
}
