import java.util.*;
public class heapifying {
    static class Heap
    {
        ArrayList<Integer>pq=new ArrayList<>();
        public void add(int data)
        {
            pq.add(data);
            int x=pq.size()-1;
            int parent=(x-1)/2;
            while(pq.get(x)<pq.get(parent))
            {
                int temp=pq.get(x);
                pq.set(x,pq.get(parent));
                pq.set(parent, pq.get(x));
                x=pq.size()-1;
                parent=(x-1)/2;
            }
        }
         public  boolean isEmpty()
        {
            return pq.size()==0;
        }
        public int delete()
        {
            int data=pq.get(0);
            //swapping
            int temp=pq.get(0);
            pq.set(0, pq.get(pq.size()-1));
            pq.set(pq.size()-1,temp);
            //step 2 remove last node
            pq.remove(pq.size()-1);
            //heapify functrion to fix
            heapify(0);
            return data;
        }   
       
        public int peek()
        {
            return pq.get(0);
        }

        public void heapify(int i)
        {
            int min=i;
            int left=(2*i+1);
            int right=(2*i+2);
            if(left<pq.size()&&pq.get(min)>pq.get(left))
            {
                min=left;
            }
            if(right<pq.size()&&pq.get(min)>pq.get(right))
            {
                min=right;
            }
            if(min!=i)
            {
                int temp=pq.get(i);
                pq.set(i, pq.get(min));
                pq.set(min, temp);
                heapify(min);
            }
        }
    }
    public static void main(String[] args) {
        Heap pq=new Heap();
        pq.add(3);
         pq.add(5);
          pq.add(7);
           pq.add(8);
            pq.add(1);
             pq.add(2);
             pq.delete();
             while(!pq.isEmpty())
             {
                System.out.println(pq.peek());
            
             }

    }

}
