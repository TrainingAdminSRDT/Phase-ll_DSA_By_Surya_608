import java.util.*;
public class linked {
    public static class node{
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
            }
            ll.next=head;
            head=ll;

        }
        public void addlast(int data)
        {
            node lm=new node(data);
            if(head==null)
            {
                head=tail=null;
            }
            tail.next=lm;
            tail=lm;
        }

        public  void print()
        {
            node temp=head;
            if(head==null)
            {
                System.out.println("linkedlist is empty");
                return;
            }
            while(temp!=null)
            {
                System.out.print(temp.data+"-------");
                temp=temp.next;
            }
            System.out.println("null");

        }
    }
    public static void main(String[] args) {
        linked ls=new linked();
        ls.addnode(1);
        ls.addlast(2);
        ls.addnode(4);
        ls.print();
        
        
    }

