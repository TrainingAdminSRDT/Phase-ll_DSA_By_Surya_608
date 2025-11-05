import java.util.*;
public class print_1_to_n {
     
    public static int nto1(int i,int n)
    {
        while(i<=n)
        {
           System.out.print(i);
            return nto1(i+1,n);

        }
        return 1;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("entter the number to which you want to call");
    int n=sc.nextInt();
    int i=1;
nto1(i,n);
    }
    
}
