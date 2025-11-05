import java.util.*;
public class sumAdd {
  public static int sum(int a,int b)
    {
    System.out.println(a+b);
    return(a+b);
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
