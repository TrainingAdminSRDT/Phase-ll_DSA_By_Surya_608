import java.util.*;
public class using_an_array {
   static class queue
    {
        static int ar[];
        static int size;
        static int rear;
         queue(int n)
        {
ar=new int[n];
size=n;rear=-1;
        }
        public  boolean isempty()
        {
            return rear==-1;
        }
        //add
        public  void  add(int data)
        {
            if(rear==size-1)
            {
                System.out.println("queue full");return;
                
            }
            rear++;
            ar[rear]=data;
            
        }
        //delete
        
    public  void delete()
    {
        if(isempty())
        {
            System.out.println("queeue underflow");
        }
        System.out.println(ar[0]+"");
        
        for(int i=0;i<rear;i++)
        {
            ar[i]=ar[i+1];
        }rear--;

    
    }
    public void  peek()
    {
        if(isempty())
        {
            System.out.println("empty queue");return;
        }

        System.out.println(ar[0]);
    }
     public  void printque()
    {
        if(isempty())
        {
            System.out.println("empty queue");return;
        }
        for(int i=0;i<=rear;i++)
        {
            System.out.print(ar[i]+",");
        }
    }
    
   
}
 
    public static void main(String[] args) {
        queue as=new queue(5);
        as.add(3);
        as.add(6);
        as.add(112);
        as.add(56);
        as.add(67);
       as.peek();
       as.printque();
       
       as.peek();
       as.printque();
       
        
    }
}
