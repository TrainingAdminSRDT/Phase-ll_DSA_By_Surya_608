import java.util.*;
public class inter {
    public static void main(String[] args) {
        king kg=new king();kg.move();kg.man();
        queen qn=new queen();
        qn.move();qn.man();
    }
}
 interface chessplayer {
void move();
    
}
interface manpower   {
 public void man();
    
}
class queen implements chessplayer,manpower
{
     public void move()
    {
        System.out.println("moving the queen");
    }
     public void man()
    {
        System.out.println("Man are strong");
    }
}
class king implements chessplayer,manpower
{
public void move()
{
System.out.println("king mover forward");
}
 public void man(){
System.out.println("man how are you");
}
}
class compounder implements chessplayer{
    public void move()
    {
        System.out.println("doesnt move at all");
    }
}