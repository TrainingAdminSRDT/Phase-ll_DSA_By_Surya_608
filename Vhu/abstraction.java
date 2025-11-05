import java.util.*;
public class abstraction {
    public static void main(String[] args) {
        chicken ch=new chicken();
ch.eats();ch.walks();
        
    }
}
abstract class animal{
    void eats()
        {
            System.out.println("animals eat");
        }
        abstract void walk();
    
}
class Horse extends animal
{
void eats()
{
    System.out.println("horse eats grass and runs fatser");

}
void walk()
{
    System.out.println("runs faster and at high pace");
}
}
class chicken extends Horse{
    void walks()
    {
        System.out.println(" walks on leg piece ");
    }
}
