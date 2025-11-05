import java.util.*;
public class queue_using_linkedlist {
    public static class node{
        int data;
        node next;
        public  node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
        public static node tail;
        public static boolean isempty()
        {
            if(head==null&&tail==null)
            {
                return true;
            }
            return false;
        }
        
        public static void addnode(int data)
        { node newnode= new node(data);
            if(head==null)
            {
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }
        public static int remove()
        {
            if(isempty())
            {
                System.out.println("empty queue");
            }
            int res=head.data;
            if(tail==head)
            {
                tail=head=null;
            }
            head=head.next;
            return res;
        }
        public static int peek()
        {
            if(isempty())
            {
                System.out.println("empty");return -1;
            }
            return head.data;
        } 

    public static void main(String[] args) {
        queue_using_linkedlist ql=new queue_using_linkedlist();
        ql.addnode(23);
        ql.addnode(56);
        ql.addnode(678);
        ql.addnode(89);
       System.out.println( ql.peek()+"top view ");
        System.out.println(ql.remove()+"removed ");
        System.out.println(ql.remove()+"removed");
        System.out.println(ql.peek()+"top view");
        
    }
}
