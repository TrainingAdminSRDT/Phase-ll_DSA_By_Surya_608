
import java.util.*;
public class inheritance {
    public static void main(String[] args) {
        
        dog dg=new dog();
        dg.habit();
        dg.danger();dg.bark();
        
    }
    
}
class animal
{
    
   
    
    void habit()
    {
        System.out.println(" eats like animal as its animal");
      
           
    }
    void danger()
    {
        System.out.println("Animals are dangerous");
    }
}
class dog extends animal
{
    void bark()
    {
        System.out.println("dogs bark");
    }
}
