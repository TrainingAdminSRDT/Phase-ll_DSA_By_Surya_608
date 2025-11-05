import java.util.*;
public class factorial {
    public static int fact(int l) {int a=1;
        if(l==0||l==1)
        {
            return 1;
        }
        else if(l>1){
        for(int i=1;i<=l;i++)
        {
             a*=i;
        }
        return a;}
        else
        {
            System.out.println("invalid");
            return 0;
        }
        
    }
    public static void main(String[] args) {
        int n,r;
        System.out.println("enter the number to find factorial");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        r=sc.nextInt();

        int c=fact(n);
        int m=fact(r);
        int d=fact(n-r);
        int bino=(c/(m*d));
        System.out.println("binomal id="+bino); 
    }
}
