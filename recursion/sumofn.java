import java.util.*;
public class sumofn {
    public static int facto(int n)
    {
if(n==0)
{
    return 0;
}
return n+facto(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(facto(n));
    }
    
}
