import java.util.*;
public class friends_pairing_problem {
    public static int friends(int n)
    {
        if(n==1||n==2)
        {
            return n;
        }
        //if people want to stand single then no of ways to stand willl be
        int fn1=friends(n-1);
        //if theey want to pair up then no of ways will be
        int fn2=friends(n-2);
        int pairways=(n-1)*fn2;
        return (fn1+pairways); 
    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of friends");
    int n=sc.nextInt();
    System.out.println(friends(n));
 }   
}
