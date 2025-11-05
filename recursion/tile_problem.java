import java.util.*;
public class tile_problem {
    public static int tile(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        //vertical placement
        int n1=tile(n-1);
        //horizontal placement
        int n2=tile(n-2);
        //total ways
        return (n1+n2);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("no of way to plot the tile is="+tile(n));
    }
    
}
