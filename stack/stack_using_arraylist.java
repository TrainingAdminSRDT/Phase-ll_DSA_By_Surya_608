import java.util.*;
public   class stack_using_arraylist {
    public static class stack{
        static ArrayList<Integer>list=new ArrayList<>();
       public static  boolean isempty()
        {
            if(list.size()==0)
            {
                return true;
            }
            else
             return false;
        }
        public static  void push(int data)
        {
            list.add(data);

        }
        public static int pop()
        {
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek()
        {
            int top=list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String[] args) {
        
        stack.push(1);
         stack.push(2);
          stack.push(3);
           stack.push(4);
            stack.push(5);
             stack.push(6);
             while(stack.isempty()!=true)
             {
                System.out.println(stack.peek());
                stack.pop();
             }
        
        
    }
    
}
