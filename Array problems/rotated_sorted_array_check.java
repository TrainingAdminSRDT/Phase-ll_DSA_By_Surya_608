import java.util.*;
public class rotated_sorted_array_check  {
    public static boolean check_sorted(int ar[])
    {int n=ar.length;
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]>ar[(i+1)%n])
            {
                
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        System.out.println("Enter elemenst into the array");
        for(int i=0;i<5;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("is array sorted ? ="+check_sorted(ar));
}
}