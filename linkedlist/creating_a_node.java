import java.util.*;
public class creating_a_node
{
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
            node cd=new node(data);
            if(head==null)
            {
                head=tail=cd;
            }
            cd.next=head;
            head=cd;

        }

    }
    public static void main(String[] args) {
        creating_a_node cd=new creating_a_node();
        cd.addnode(1);
        cd.addnode(2);
       
        
    }
