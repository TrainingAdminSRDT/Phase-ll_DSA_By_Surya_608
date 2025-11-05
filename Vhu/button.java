import java.util.*;
public class button {
    public static void main(String args[])
    {
        System.out.println("enter your choice");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("come in");
                break;
                case 2:
                {
                    System.out.println("go out");
                    break;
                }
        
            default:
            System.out.println("do nothing");
                break;
        }
    }
}
