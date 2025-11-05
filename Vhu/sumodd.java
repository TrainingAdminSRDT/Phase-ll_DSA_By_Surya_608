import java.util.*;
public class sumodd {
    public static int sum(int n)
    {
        int sumo=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                sumo+=i;
            }
            else{}
        }
        return sumo;
    }
    public static void main(String[] args) {
        int n;Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("sum of 1 to n odd numbers is ="+sum( n));
    }
    
}
