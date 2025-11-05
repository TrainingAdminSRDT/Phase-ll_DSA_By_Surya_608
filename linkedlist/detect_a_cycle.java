import java.util.*;
public class detect_a_cycle {
    public  static class node{
        int data;
        node next;
        public void node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }
    public static node head;
    public static node tail;
    public void addnode(int data)
    {
        node nd=new node();
        if(head==null)
        {
            head=tail=nd;
            return;
        }
        tail.next=nd;
        tail=nd;

    }
    //detecting a cycle using slow fast pointer approach
    public static boolean detect_cycle()
    {
        node slow=head;
        node fast=head;
        while(fast!=null&& fast.next!=null)
        {
            slow=slow.next;
          fast=fast.next.next;
        
            if(slow==fast)
            {
                return true;
            }
          
       
    }
     return false;
}
    public static void main(String[] args) {
        detect_a_cycle dc=new detect_a_cycle();
        dc.addnode(1);
        dc.addnode(2);
        dc.addnode(3);
        dc.addnode(4);
        System.out.println(detect_cycle());
    }
}

