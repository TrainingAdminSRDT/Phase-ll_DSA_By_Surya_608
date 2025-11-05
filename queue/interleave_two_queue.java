import java.util.*;
public class interleave_two_queue {
    public static void INTERLEAVE(Queue<Character>q)
    {
Queue<Character>q2=new LinkedList<>();
int size=q.size();
for(int i=0;i<size/2;i++)
{
    q2.add(q.remove());
}
while(!q2.isEmpty())
{
q.add(q2.remove());
q.add(q.remove());
}
while(!q.isEmpty())
{
    System.out.print(q.remove());
}
System.out.println();
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
                 INTERLEAVE(que);
        
    }
    
}
