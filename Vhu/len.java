import java.util.*;
public class len {
    public static void main(String[] args) {
        System.out.println("enter the 6 names ");
        String str[]=new String[6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            str[i]=sc.nextLine();
        }
        System.out.println("sumof cumulative length is");
        {int sum=0;
            for(int i=0;i<6;i++)
            {
                 sum+=str[i].length();

            }
            System.out.println(sum);
        }
    }
    
}
