import java.util.*;
public class butterfly_pattern {
    public static void butter(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //for star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //for spaces
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            //for star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //for spaces
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solidrhombus(int l)
    {
        for(int i=1;i<=l;i++)
        {
            for(int j=1;j<=l-i;j++)
            {
                System.out.print(" ");
            }
            //stars 
            for(int k=1;k<=l;k++)
            {
                System.out.print("*");
            }
            System.out.println();;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;System.out.println("enter the number of lines of the code");
        n=sc.nextInt();
        butter(n);
        solidrhombus(n);
    }
    
}
