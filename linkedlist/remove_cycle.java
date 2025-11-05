import java.util.*;
public class remove_cycle {
    public  static class node{
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
    //detecting a cycle using slow fast pointer approach
    public static node getdetect_cycle()
    {
        node slow=head;
        node fast=head;
        while(fast!=null&& fast.next!=null)
        {
            slow=slow.next;
          fast=fast.next.next;
        
            if(slow==fast)
            {
                return slow;
            
            }
          
       
    }
     return null;
}
  }

   


public static void 
     slow=head;
     node prev=null;
     if(slow!=fast)
     {
        prev=fast;
        slow=slow.next;
        fast=fast.next;

     }
     //removing link
     prev.next=null;
}
//assignment
    public static void main(String[] args) {
        remove_cycle dc=new remove_cycle();
        dc.addnode(1);
        dc.addnode(2);
        dc.addnode(3);
        dc.addnode(4);
        System.out.println(detect_cycle());
    }
}

