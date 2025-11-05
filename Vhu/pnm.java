import java.util.*;
public class pnm {
  public static double sum(int a,int b)
    {
    double sumn=Math.pow(a,b);
    System.out.println(sumn);
    return sumn;
    }
    public static void  main(String args[])

    {
int a,b;
Scanner sc =new Scanner(System.in);
System.out.println("enter two numbers");
a=sc.nextInt();
b=sc.nextInt();
sum(a,b);
    }
}