import java.util.*;
public class xtopown {
     
    public static int pow(int n,int p)
    {
        if(p==0)
        {
         return 1;
        }
         return n*pow(n, p-1);
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("entter the number and its exponent power");
    int n=sc.nextInt();
    int p=sc.nextInt();
      System.out.println(  pow(n,p));
    }
    
}