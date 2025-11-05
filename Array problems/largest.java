import java.util.*;

public class largest {
    public static int largest_element(int ar[])
    {int max=ar[0];
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]>max)
            {
                max=ar[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        System.out.println("Enter elemenst into the array");
        for(int i=0;i<5;i++)
        {
            ar[i]=sc.nextInt();
        }
       System.out.println( largest_element(ar)+" is the largest element");
    }
    
}
