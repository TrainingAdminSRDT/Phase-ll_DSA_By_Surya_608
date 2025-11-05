import java.util.*;
public class power_of {
    public static boolean ispower(int n )
    {
        if(n==1)
        {
            return true;
        }
        if(n<=0||n%4!=0)
        {
            return false;
        }
        return ispower(n/4);
    }
    public static void main(String[] args) {
        int n=16;
        System.out.println("is the given number power of four="+ispower(n));
    }
}
