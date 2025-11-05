import java.util.*;
public class insert_in_middle {
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
    public static node tail;

    
    public  void addnode(int data)
    {
        node ll=new node(data);
        if(head==null)
        {
             head=tail=ll;
return;
        }
        tail.next=ll;
        tail=ll;
       
    }
    public void addinmiddle(int index,int data)
    {
        node newnode=new node(data);
        int i=0;
        node temp=head;
        
        while(i<index-1&& temp!=null)
        {
        
             
            temp=temp.next;i++;
            
        }
         if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }
        newnode.next=temp.next;
        temp.next=newnode;

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
        insert_in_middle sm=new insert_in_middle();
        sm.addnode(1);
        sm.addnode(2);
        sm.addnode(3);
        sm.addnode(4);sm.addnode(5);sm.addnode(6);sm.addnode(7);sm.addnode(8);sm.addnode(9);
        sm.addinmiddle(5, 98);
        sm.print();
        
    }
    
}
