import java.util.*;
public class remove_nth_node_from_end {
    public static class node{
        int data;node next;
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
        node nd =new node();
        if(head==null)
        {
            head=tail=null;
        }
        tail.next=nd;tail=nd;
    }
    public static void delmiddle(int data,int n){
        int size=0;
        node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        if(n==size)
        {
            head=head.next;
            return;

        }
        int i=1;
        int indextofind=size-n;
        node prev=head;i++;
        while (i<indextofind) {
            prev=prev.next;i++;
            
        }
prev.next=prev.next.next;return;

    }
    public static  void printnode()
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
        remove_nth_node_from_end sm=new remove_nth_node_from_end();
        sm.addnode(1);
        sm.addnode(2);
        sm.addnode(3);
        sm.addnode(4);sm.addnode(5);sm.addnode(6);sm.addnode(7);sm.addnode(8);sm.addnode(9);
        printnode();
        delmiddle(4, 1);
    }
}
