import java.util.*;
public class pro {
    public static int product(int a,int b,int c) {
        int avge=(a*b*c);
        return avge;
    }
    public static void main(String[] args) {
        int a,b,c;
Scanner sc =new Scanner(System.in);
System.out.println("enter three numbers");
a=sc.nextInt();
b=sc.nextInt();c=sc.nextInt();
System.out.println("product is="+product(a, b, c));
    }
    
}
