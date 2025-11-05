import java.util.*;
public class nsum {
 public static void main(String args[])
 {
 int a,sum,lsum=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the limit to which you want to add");
 a=sc.nextInt();
    sum=(a*(a+1))/2;
    System.out.println(sum);
    for(int i=1;i<=a;i++)
    {
       lsum+=a;
    }
    System.out.println("sum through loop is="+lsumsum);
}
}
