import java.util.*;
public class avg {
    public static int average(int a,int b,int c) {
        int avge=(a+b+c)/3;
        return avge;
    }
    public static void main(String[] args) {
        int a,b,c;
Scanner sc =new Scanner(System.in);
System.out.println("enter three numbers");
a=sc.nextInt();
b=sc.nextInt();c=sc.nextInt();
System.out.println("average is="+average(a, b, c));
    }
    
}
