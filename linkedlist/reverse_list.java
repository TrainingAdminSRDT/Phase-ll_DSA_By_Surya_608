import java.util.*;
public class reverse_list {
    public static class node 
    {
        int data;node next;
        public  node(int data)
        {
            this.data=data;
            this.next=null;
        }
    
           }
           public static node head;
           public static node tail;
           public void addnode(int data)
           {
            node nd=new node(data);
            if(head==null)
            {
                head=tail=nd;
                return;
            }
            tail.next=nd;
            tail=nd;

           }
           public static  node reversenode(node head)
           {
            node prev=null;
            node current=head;
            node next;
            tail=head;
            while(current!=null)
            {
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;

            }
            return prev;

           }
           public  void printnode()
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
        reverse_list sm=new reverse_list();
         sm.addnode(1);
        sm.addnode(2);
        sm.addnode(3);
        sm.addnode(4);sm.addnode(5);sm.addnode(6);sm.addnode(7);sm.addnode(8);sm.addnode(9);
        head=reversenode(head);
        sm.printnode();
    }
}
