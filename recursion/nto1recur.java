import java.util.*;
public class nto1recur {
    public static void to1(int n)
    {
        if(n==1)
        {
            System.out.println(1+",");
            return;
        }
        System.out.print(n+" ,");
        to1(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        to1(n);
    }
    
}
