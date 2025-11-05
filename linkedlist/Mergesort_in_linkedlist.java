import java.util.*;
public class Mergesort_in_linkedlist {
     public static class node
    {
        int data;
    node next;
    public node(int data)
    {
        this.data=data;
        this.next=null;

    }
}
public static node head;
//divide
public node mergesort(node head)
{
    if(head==null||head.next==null)
    {
        return head;
    }
    node mid=getmid(head);
    node righthead=mid.next;
    mid.next=null;
    node newleft=mergesort(head);
    node newright=mergesort(righthead);
    return merge(newleft,newright);
} 
public node getmid(node head)
{
    node slow=head;
    node fast=head.next;
    while(fast!=null&& fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;

}
public node merge(node head1,node head2)
{
    node mergedll=new node(-1);
    node temp=mergedll;
    while(head1!=null && head2!=null)
    {
        if(head1.data<=head2.data)
        {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
    }
    while(head1!=null)
    {
        temp.next=head1;
         head1=head1.next;
            temp=temp.next;
    }
    while(head2!=null)
    {
        temp.next=head2;
         head2=head2.next;
            temp=temp.next;
    }
    return mergedll.next;


}
 
      public void addFirst(int data) {
        node newNode = new node(data);
        newNode.next = head;  // FIXED: This line correctly links the new node to the existing list
        head = newNode;       // Now, new node becomes the new head
    }
    public void print()
    { node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"------");
temp=temp.next;
        }
        System.out.println(">");
    }
    public static void main(String[] args) {
        Mergesort_in_linkedlist sm=new Mergesort_in_linkedlist();
       
         sm.addFirst(1);
        sm.addFirst(2);
        sm.addFirst(3);
        sm.addFirst(4);sm.addFirst(5);sm.addFirst(6);sm.addFirst(7);sm.addFirst(8);sm.addFirst(9);
        sm.print();
       sm.head=sm.mergesort(sm.head);
       sm.print();
    }
}
