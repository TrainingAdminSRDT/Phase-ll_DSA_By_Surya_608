import java.util.*;
public class search {
    public static class node{
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
        node ad=new node(data);
        if(head==null)
        {
            head=tail=ad;
            return;
        }
        tail.next=ad;
        tail=ad;
    }
    /*public  static int dellastnode()
    {
        node temp=head;node r=null;
        while(temp.next!=null)
        {
             r=temp;
            temp=temp.next;
        }
        int val=r.data;
        r.next=null;
        tail=r;
        return val;


    }*/  
    public static  int searchin(int key)
    {int size=0;
        node temp=head;
        
        while(temp!=null)
        {size++;
            if(temp.data==key)
            {
                return (size-1);
            }
            else{
             temp=temp.next;}

        }
       
        return -1;
    }
    public static void  print()
    {node temp=head;
        
        while(temp!=null)
        {
            System.out.print(temp.data+"------");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        search sm=new search();
        sm.addnode(1);
        sm.addnode(2);
        sm.addnode(3);
        sm.addnode(4);sm.addnode(5);sm.addnode(6);sm.addnode(7);sm.addnode(8);sm.addnode(9);
        print();
       System.out.println("key index="+ searchin(7));
        print();
    }
    
}
