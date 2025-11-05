import java.util.*;
public class check_palindrome {
    public static class node{
        int data;node next;
        public node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public  void  addnode(int data)
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
    //now checking palindrome 
    //slow fast approach
    public static node findmiddle(node head)
    {

    
    node slow=head;
    node fast=head;
    // jb bhi no of nodes even hogi to fast pointer end me fast==null pe ajayega aur slow mid pe.
    //aur jb bhi odd no of nodes hogi toh fast pointer ka next ==null aur slow mid pe.
    while(fast!=null&&fast.next!=null)
    {
       slow= slow.next;
       fast=fast.next.next;

    }
    return slow;
}
public static boolean check_pali()
{
    if(head==null&&head.next==null)
    {
        return true;
    }
    node prev=null;
    node midnode=findmiddle(head);
    node current=midnode;
    node next;
    while(current!=null)
    {
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    } 
    node right=prev;
    node left=head;
    while(right!=null)
    {
        if(right.data!=left.data)
        {
            return false;
        }
        left=left.next;
        right=right.next;
    }
    return true;
}

    public static void main(String[] args) {
        check_palindrome cp=new check_palindrome();
        cp.addnode(4);
        cp.addnode(4);
        cp.addnode(4);
        cp.addnode(4);
        cp.addnode(4);  
       System.out.println(check_pali());

    }
}
