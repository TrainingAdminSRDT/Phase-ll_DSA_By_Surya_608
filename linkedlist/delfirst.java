import java.util.*;
public class delfirst {
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
    public static int size;
    public  void addnode(int data)
    {
node ll=new node(data);
size++;
if(head==null)
{
    head=tail=ll;
    return;
}
tail.next=ll;
tail=ll;
    }
    
    public int delnode()
    {
        if(size==0)
        {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            return val;
        }
        else
        {
            int val=head.data;
            head=head.next;return val;
        }
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
        delfirst sm=new delfirst();
        sm.addnode(1);
        sm.addnode(2);
        sm.addnode(3);
        sm.addnode(4);sm.addnode(5);sm.addnode(6);sm.addnode(7);sm.addnode(8);sm.addnode(9);
        print();
        sm.delnode();
        print();


    }
}
