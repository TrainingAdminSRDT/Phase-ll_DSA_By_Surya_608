import java.util.*;
public class nto1 {
     
    public static int ntoo1(int n)
    {
        while(n>0)
        {
           System.out.print(n);
           return ntoo1(n-1);

        }
        return -1;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("entter the number to which you want to call");
    int n=sc.nextInt();
        ntoo1(n);
    }
    
}