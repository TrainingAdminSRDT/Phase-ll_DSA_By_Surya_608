import java.util.*;
public class printprime {
public  static boolean isprime(int k)
{ boolean isp=true;
    for(int i=2;i<=Math.sqrt(k);i++)
{
    if(k%i==0)
    {
        isp=false;
        return isp;
    }
    
}
return true;
}

    public static void main(String[] args) {
        
        System.out.println("enter the length to which the numbers you want");
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
           if(isprime(i))
           {
            System.out.print(i+",");
           }
        }
        
        
    }
    
}
