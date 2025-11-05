import java.util.*;
public class decitobin {
        public static int decima(int n)
{int bin=0;int j=0;
    while(n>=0)
    {
        int d=n%2;
        bin=bin+(d*(int)Math.pow(10, j));
        j++;
        n=n/2;

    }
    return bin;
}

    public static void main(String[] args) {
        int n;
        System.out.println("enter the decimal number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(" binary number is="+decima(n));

    }
}

