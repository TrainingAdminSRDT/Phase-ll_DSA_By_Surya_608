import java.util.*;
public class fibbonacchi {
    public static int fibo(int a)
    {
int n1=0,n2=1;
System.out.print(n1+",");
System.out.print(n2+",");

for(int i=2;i<=a;i++)
{
    int c=n1+n2;
    System.out.print(c+",");
    n1=n2;n2=c;
}
return 1;
    }
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        fibo(a);

    }
    
}
