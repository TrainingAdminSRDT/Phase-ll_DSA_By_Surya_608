import java.util.*;
public class stack_using_linkedlist {
    public static class node
    {
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
    public static boolean isempty()
    {
        return head==null;

    }
    public void push(int data)
    {
        node n=new node(data);
                      n.next=head;
        head=n;
    }

    public  int pop()
    {
        if(isempty())
        {
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;

    }
     public int peek() {
            if (isempty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return head.data;
        }
    public   void print()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-----");
            temp=temp.next;
        }
        System.out.println("null");
    }
 public static void main(String[] args) {
    stack_using_linkedlist nd=new stack_using_linkedlist();
    nd.push(1);
    nd.push(2);
    nd.push(3);
    nd.push(6);
    nd.push(8);
    nd.print();
     System.out.println("Top element is: " + nd.peek());
        nd.pop();
        System.out.println("After popping one element:");
        nd.print();
    
 }   
}
