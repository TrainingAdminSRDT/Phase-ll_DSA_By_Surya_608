import java.util.*;
public class bintodeci
{
public static int bin(int n)
{int deci=0;int j=0;
    while(n>0)
    {
        int d=n%10;
        deci+=d*Math.pow(2, j);
        j++;
        n=n/10;


    }
    return deci;
}

    public static void main(String[] args) {
        int n;
        System.out.println("enter the binary  number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(" decimal number is="+bin(n));

    }
}
