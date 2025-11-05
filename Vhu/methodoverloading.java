import java.util.*;
public class methodoverloading {
    public static void main(String[] args) {

        calcu cu=new calcu();cu.sum(2,5);
        cu.sum(1,3,4);
        cu.sum(1);
        
    }
}
class calcu
{
 void sum(int a,int b)
{
    System.out.println(a+b);
}  
void sum(int a,int b,int c)
{
    System.out.println(a+b+c);
}  
void sum(int a)
{
    System.out.println(a);
} 
}   


