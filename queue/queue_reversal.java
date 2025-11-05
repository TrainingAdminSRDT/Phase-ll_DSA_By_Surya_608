import java.util.*;
public class queue_reversal {
    public static void reverseal(Queue<Character>q)
    {
        Stack<Character>st=new Stack<>();
       
        while(!q.isEmpty())
        {
            st.push((q.remove()));
        }
        while(st.isEmpty())
        {
            q.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Character>que=new LinkedList<>();
         que.add('1');
         que.add('2');
          que.add('3');
           que.add('4');
            que.add('5');
             que.add('6');
              que.add('7');
               que.add('8');
                que.add('9');
                 que.add('0');
                 reverseal(que);
                 while(!que.isEmpty())
                 {
                    System.out.print(que.remove());
                 }
                 System.out.println();
    }
}
