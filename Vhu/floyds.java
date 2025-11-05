import java.util.*;
public class floyds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=1;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(k+" ");k++;
            }
            System.out.println(" ");
        }
        
    }
}
