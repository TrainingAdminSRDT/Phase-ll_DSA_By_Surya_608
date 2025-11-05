import java.util.*;
public class subarray {
    public static void subarr(int array[])
    {int ts=0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=i;j<array.length;j++)
            {
                for(int start=i;start<=j;start++)
                {
                    System.out.print(array[start]+" ");
                }ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts+" total subarray");;
    }
    public static void main(String[] args) {
        int arr[]=new int[4];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array elements");
        for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    } 
subarr(arr);
}
    
}
